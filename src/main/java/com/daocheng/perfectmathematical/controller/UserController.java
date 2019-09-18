package com.daocheng.perfectmathematical.controller;

import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.daocheng.perfectmathematical.pojo.SysUser;
import com.daocheng.perfectmathematical.servier.UserServier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServier userServier;

    /**
     * 用户登录 并返回token
     * @param map
     * @return
     */
    @PostMapping("/user_login")
    public JsonResult login(@RequestBody Map<String,Object> map){
        String name = (String)map.get("name");
        String password = (String)map.get("password");
        return userServier.userLogin(name,password);
    }

}
