package com.admin.springbootadmintemplate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.admin.springbootadmintemplate.entity.Permission;
import com.admin.springbootadmintemplate.service.PermissionService;
import com.admin.springbootadmintemplate.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author ly182
* @description 针对表【permission】的数据库操作Service实现
* @createDate 2023-06-21 17:18:00
*/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission>
    implements PermissionService{

}




