package com.aiseot.oom.markservice.service;

import com.aiseot.oom.markservice.dao.MarkDao;
import com.aiseot.oom.markservice.entity.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MarkService {
    @Autowired
    private MarkDao markDao;

    public Mark login(HashMap<String,String> argMap){
        System.out.println(argMap.toString());
        return markDao.selectOneByNanmeAndPwd(argMap);
    }

    public Mark reg(HashMap<String, String> argMap) {
        System.out.println(argMap.toString());
        Mark mark = new Mark();
        mark.setUsername(argMap.get("username"));
        mark.setPassword(argMap.get("password"));
        mark.setUserid(markDao.insertOne(argMap));
        return mark;
    }
}
