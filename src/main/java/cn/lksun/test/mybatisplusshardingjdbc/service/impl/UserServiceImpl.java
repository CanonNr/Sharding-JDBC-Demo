package cn.lksun.test.mybatisplusshardingjdbc.service.impl;

import cn.lksun.test.mybatisplusshardingjdbc.entity.User;
import cn.lksun.test.mybatisplusshardingjdbc.mapper.UserMapper;
import cn.lksun.test.mybatisplusshardingjdbc.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Override
    public String getNameById(Long id) {
        return null;
    }
}
