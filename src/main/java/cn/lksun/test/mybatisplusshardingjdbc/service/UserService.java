package cn.lksun.test.mybatisplusshardingjdbc.service;

import cn.lksun.test.mybatisplusshardingjdbc.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;


public interface UserService extends IService<User> {
    public String getNameById(Long id);
}
