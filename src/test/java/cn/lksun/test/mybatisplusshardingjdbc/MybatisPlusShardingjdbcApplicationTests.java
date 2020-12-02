package cn.lksun.test.mybatisplusshardingjdbc;

import cn.lksun.test.mybatisplusshardingjdbc.mapper.UserMapper;
import cn.lksun.test.mybatisplusshardingjdbc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MybatisPlusShardingjdbcApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        /*
        // 插入100条数据,状态为1-4随机取
        int [] arr = {1,2,3,4};
        ArrayList<User> userList = new ArrayList<User>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setName("游客"+i);
            user.setStatus(arr[(int)(Math.random()*arr.length)]);
            userList.add(user);
            // (1) Mapper CURD 每次添加一条数据
            // userMapper.insert(user);
        }
        */

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
        // QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        // System.out.println(userService.getOne(userQueryWrapper.eq("name", "游客25")));

    }

}
