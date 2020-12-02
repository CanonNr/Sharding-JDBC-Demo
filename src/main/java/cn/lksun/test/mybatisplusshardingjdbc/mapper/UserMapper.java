package cn.lksun.test.mybatisplusshardingjdbc.mapper;

import cn.lksun.test.mybatisplusshardingjdbc.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface  UserMapper extends BaseMapper<User> {
    public String getNameById(Long id);
}
