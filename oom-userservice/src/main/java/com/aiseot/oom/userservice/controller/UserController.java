package com.aiseot.oom.userservice.controller;

import com.aiseot.oom.userservice.entity.User;
import com.aiseot.oom.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public User login(@RequestParam String username,@RequestParam String password){
        HashMap<String,String> argMap = new HashMap<>();
        argMap.put("username",username);
        argMap.put("password",password);
        User user = userService.login(argMap);
        return user;
    }
    @RequestMapping("/reg")
    public User reg(@RequestParam String username,@RequestParam String password){
        HashMap<String,String> argMap = new HashMap<>();
        argMap.put("username",username);
        argMap.put("password",password);
        User user = userService.reg(argMap);
        return user;
    }
}
