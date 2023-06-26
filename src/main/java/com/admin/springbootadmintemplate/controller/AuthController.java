package com.admin.springbootadmintemplate.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import com.admin.springbootadmintemplate.entity.R;
import com.admin.springbootadmintemplate.entity.User;
import com.admin.springbootadmintemplate.service.UserService;
import com.alibaba.fastjson2.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController{
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public R login(@RequestBody User user){
        boolean login = userService.login(user);
        if (login) {
            StpUtil.login(user.getName());
            SaTokenInfo tokenInfo = StpUtil.getTokenInfo();

            System.out.println(R.ok(tokenInfo.getTokenValue()));
            return R.ok(tokenInfo.getTokenValue());
        }
        return R.fail();
    }
}
