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
class Test2_AddressInsert {

    @Resource
    private UserMapper userMapper;

    @Resource
    private AddressMapper addressMapper;

    @Test
    void contextLoads() {

        Address address = new Address();
        address.setGroupId(3);
        address.setUserId(123123123L);
        address.setAddress("xxxx");
        addressMapper.insert(address);

    }

}
