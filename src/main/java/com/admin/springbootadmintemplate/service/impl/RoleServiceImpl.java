package com.admin.springbootadmintemplate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.admin.springbootadmintemplate.entity.Role;
import com.admin.springbootadmintemplate.service.RoleService;
import com.admin.springbootadmintemplate.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author ly182
* @description 针对表【role】的数据库操作Service实现
* @createDate 2023-06-21 17:18:50
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




