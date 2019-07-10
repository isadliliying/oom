package com.aiseot.oom.userservice.service;

import com.aiseot.oom.userservice.dao.UserDao;
import com.aiseot.oom.userservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User login(HashMap<String,String> argMap){
        System.out.println(argMap.toString());
        return userDao.selectOneByNanmeAndPwd(argMap);
    }

    public User reg(HashMap<String, String> argMap) {
        System.out.println(argMap.toString());
        User user = new User();
        user.setUsername(argMap.get("username"));
        user.setPassword(argMap.get("password"));
        user.setUserid(userDao.insertOne(argMap));
        return user;
    }
}
