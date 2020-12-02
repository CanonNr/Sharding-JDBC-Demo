package cn.lksun.test.mybatisplusshardingjdbc;

import cn.lksun.test.mybatisplusshardingjdbc.entity.User;
import cn.lksun.test.mybatisplusshardingjdbc.mapper.UserMapper;
import cn.lksun.test.mybatisplusshardingjdbc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class MybatisPlusShardingjdbcApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        // 插入100条数据,状态为1-4随机取
        int [] arr = {1,2,3,4};
        ArrayList<User> userList = new ArrayList<User>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setName("游客"+i);
            user.setStatus(arr[(int)(Math.random()*arr.length)]);
            userList.add(user);
        }

        System.out.println(userMapper.getNameById(1333956965229178881L));
        //userMapper.insert(user);
//        userService.saveBatch(userList);
        // 获取所有数据
        //System.out.println(userMapper.selectList(null));

//        System.out.println(userMapper.selectById(1333698701316882434L));
//        System.out.println(userMapper.selectById(1333698701459488770L));
//        System.out.println(userMapper.selectById(1333698701648232449L));
//        System.out.println(userMapper.selectById(1333698702273183747L));

//        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("name","游客13");
//        System.out.println(userMapper.selectByMap(map));

    }

}
