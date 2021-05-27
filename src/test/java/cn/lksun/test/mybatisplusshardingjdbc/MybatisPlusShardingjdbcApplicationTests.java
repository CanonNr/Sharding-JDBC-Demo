package cn.lksun.test.mybatisplusshardingjdbc;

import cn.lksun.test.mybatisplusshardingjdbc.entity.User;
import cn.lksun.test.mybatisplusshardingjdbc.mapper.UserMapper;
import cn.lksun.test.mybatisplusshardingjdbc.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;


@SpringBootTest
class MybatisPlusShardingjdbcApplicationTests {

    @Resource
    private UserMapper userMapper;

//    @Autowired
//    private UserService userService;

    @Test
    void contextLoads() {

        // 插入100条数据,状态为1-4随机取

        int [] arr = {1,2,3,4};
        int [] group = {1,2,3,4,5,6};

        ArrayList<User> userList = new ArrayList<User>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setName("游客"+i);
            int status = arr[(int) (Math.random() * arr.length)];
            user.setStatus(status);
            int groupId = group[(int) (Math.random() * group.length)];
            user.setGroupId(6);
            userList.add(user);
            // (1) Mapper CURD 每次添加一条数据
             userMapper.insert(user);
            System.out.println("ok");
        }


//        User user = new User();
//        user.setName("游客");
//        int status = arr[(int) (Math.random() * arr.length)];
//        user.setStatus(status);
//        user.setGroupId(6);
//        Integer insert = userMapper.insert(user);
//        System.out.println(insert);
//        System.out.println(user.getId());
//        System.out.println("ok");

        // (2) Mapper CURD 批量添加
        // userService.saveBatch(userList);

        // (3) Mapper CURD 获取所有数据
        // System.out.println(userMapper.selectList(null));


        // (4) Mapper CURD 自定义Mapper
        // System.out.println(userMapper.getNameById(1333956965229178881L));

        // (5) Mapper CURD 通过Map条件查询
        // HashMap<String, Object> map = new HashMap<String, Object>();
        // map.put("name","游客13");
        // System.out.println(userMapper.selectByMap(map));

        // (6) Service CURD 通过条件构造器条件查询
//         QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//         System.out.println(userService.getOne(userQueryWrapper.eq("name", "游客25")));

    }

}
