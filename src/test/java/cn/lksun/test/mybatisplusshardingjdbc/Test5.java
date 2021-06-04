package cn.lksun.test.mybatisplusshardingjdbc;

import cn.lksun.test.mybatisplusshardingjdbc.entity.Address;
import cn.lksun.test.mybatisplusshardingjdbc.entity.Goods;
import cn.lksun.test.mybatisplusshardingjdbc.entity.User;
import cn.lksun.test.mybatisplusshardingjdbc.mapper.AddressMapper;
import cn.lksun.test.mybatisplusshardingjdbc.mapper.GoodsMapper;
import cn.lksun.test.mybatisplusshardingjdbc.mapper.UserMapper;
import cn.lksun.test.mybatisplusshardingjdbc.pagehelper.PageResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;
import java.util.List;

/**
 * sharding-jdbc 与 PageHelper 整合有错，待解决
 */
@SpringBootTest
class Test5 {
    @Resource
    GoodsMapper goodsMapper;

    @Test
    void contextLoads() {

//        PageResult<Address> result = UnPageHelper.doSelect(1,5,()->{
//                    addressMapper.getAddressByName("游客15");
//            }
//        );
//        System.out.println(result);

        List<Goods> goods = goodsMapper.selectAll();
        System.out.println(goods);
    }

}
