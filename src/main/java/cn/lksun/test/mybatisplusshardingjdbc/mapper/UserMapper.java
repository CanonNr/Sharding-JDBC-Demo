package cn.lksun.test.mybatisplusshardingjdbc.mapper;

import cn.lksun.test.mybatisplusshardingjdbc.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface  UserMapper extends BaseMapper<User> {
    public String getNameById(Long id);


    public Integer Insert(User user);

    public User getUser(@Param("id") Long id,@Param("groupId") Integer groupId);
}
