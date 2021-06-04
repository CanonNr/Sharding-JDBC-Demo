package cn.lksun.test.mybatisplusshardingjdbc;

import cn.lksun.test.mybatisplusshardingjdbc.entity.User;
import cn.lksun.test.mybatisplusshardingjdbc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class Test0_UserInsert {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {

         // 插入100条数据,状态为1-4随机取

        int [] group = {1,2,3};

        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setName("游客"+i);
            user.setStatus(1);
            int groupId = group[(int) (Math.random() * group.length)];
            user.setGroupId(groupId);
            userMapper.insert(user);
            System.out.println("ok");
        }


    }

}
