package com.admin.springbootadmintemplate.mapper;

import com.admin.springbootadmintemplate.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
* @author ly182
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-06-21 17:18:50
* @Entity generator.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where name = #{name}")
    User findByName(String name);
}




