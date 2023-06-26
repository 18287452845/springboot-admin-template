package com.admin.springbootadmintemplate.service;

import com.admin.springbootadmintemplate.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ly182
* @description 针对表【user】的数据库操作Service
* @createDate 2023-06-21 17:18:50
*/
public interface UserService extends IService<User> {

    boolean login(User user);
}
