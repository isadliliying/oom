package com.aiseot.oom.markservice.controller;

import com.aiseot.oom.markservice.entity.Mark;
import com.aiseot.oom.markservice.service.MarkService;
import com.aiseot.oom.markservice.util.ResMoudle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MarkController {

    @Autowired
    private MarkService markService;

    /**
     * 添加书签
     * @param Mark
     * @return ResMoudle
     */
    @RequestMapping("/add")
    public ResMoudle addMark(@RequestBody Mark mark){
        System.out.println(mark);
        ResMoudle rm = markService.addMark(mark);
        return rm;
    }

}
