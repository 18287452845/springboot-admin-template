package com.admin.springbootadmintemplate.service.impl;

import com.admin.springbootadmintemplate.entity.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.admin.springbootadmintemplate.service.UserService;
import com.admin.springbootadmintemplate.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author ly182
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-06-21 17:18:50
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
@Autowired
private UserMapper userMapper;
    @Override
    public boolean login(User user) {
        User user1 = userMapper.findByName(user.getName());
        if (user1 != null) {
            if (user1.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}




