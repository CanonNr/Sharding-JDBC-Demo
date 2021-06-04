package cn.lksun.test.mybatisplusshardingjdbc.mapper;

import cn.lksun.test.mybatisplusshardingjdbc.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    List<Address> getAll();

    List<Address>  getAddressByName(String name);
}