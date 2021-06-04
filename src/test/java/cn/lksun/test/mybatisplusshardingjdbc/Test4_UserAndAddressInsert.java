package cn.lksun.test.mybatisplusshardingjdbc;

import cn.lksun.test.mybatisplusshardingjdbc.entity.Address;
import cn.lksun.test.mybatisplusshardingjdbc.entity.User;
import cn.lksun.test.mybatisplusshardingjdbc.mapper.AddressMapper;
import cn.lksun.test.mybatisplusshardingjdbc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;


@SpringBootTest
class Test4_UserAndAddressInsert {

    @Resource
    private UserMapper userMapper;

    @Resource
    private AddressMapper addressMapper;

    @Test
    void contextLoads() {
        List<Address> all = addressMapper.getAll();
        System.out.println(all);

        String [] addressArray = {"北京市","上海市","广州市","深圳市","杭州市","南京市","成都市"};
        int [] group = {1,2,3};

        for (int i = 1; i <= 100; i++) {
            int groupId = group[(int) (Math.random() * group.length)];
            User user = new User();
            user.setName("游客"+i);
            user.setStatus(1);
            user.setGroupId(groupId);
            userMapper.insert(user);
            System.out.println("---"+user.getId());
            for (int j = 0; j < 2; j++) {
                Address address = new Address();
                address.setGroupId(groupId);
                address.setUserId(user.getId());
                address.setAddress(addressArray[(int) (Math.random() * addressArray.length)]);
                addressMapper.insert(address);
            }
        }
    }

}
