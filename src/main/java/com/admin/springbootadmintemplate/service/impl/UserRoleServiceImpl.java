package com.admin.springbootadmintemplate.service.impl;

import com.admin.springbootadmintemplate.entity.UserRole;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.admin.springbootadmintemplate.service.UserRoleService;
import com.admin.springbootadmintemplate.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author ly182
* @description 针对表【user_role】的数据库操作Service实现
* @createDate 2023-06-21 17:18:50
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService{

}




