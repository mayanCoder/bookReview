package com.mayan.controller;

import com.mayan.entity.User;
import com.mayan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/book/login")
    public String login(String username,String password){
        User user = userService.getUser(username,password);
        if (user==null) return "admin/login";
        return "admin/index";
    }
    @RequestMapping("/")
    public String index(){
        return "admin/index";
    }
}
