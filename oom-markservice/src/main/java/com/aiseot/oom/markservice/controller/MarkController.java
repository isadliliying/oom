package com.aiseot.oom.markservice.controller;

import com.aiseot.oom.markservice.entity.Mark;
import com.aiseot.oom.markservice.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MarkController {

    @Autowired
    private MarkService markService;

    @RequestMapping("/add")
    public Mark login(@RequestParam String username, @RequestParam String password){
        HashMap<String,String> argMap = new HashMap<>();
        argMap.put("username",username);
        argMap.put("password",password);
        Mark mark = markService.login(argMap);
        return mark;
    }
    @RequestMapping("/reg")
    public Mark reg(@RequestParam String username, @RequestParam String password){
        HashMap<String,String> argMap = new HashMap<>();
        argMap.put("username",username);
        argMap.put("password",password);
        Mark mark = markService.reg(argMap);
        return mark;
    }
}
