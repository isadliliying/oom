package com.aiseot.oom.markservice.service;

import com.aiseot.oom.markservice.dao.MarkMapper;
import com.aiseot.oom.markservice.entity.Mark;
import com.aiseot.oom.markservice.util.ResMoudle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkService {
    @Autowired
    private MarkMapper markMapper;

    public ResMoudle addMark(Mark mark) {
        ResMoudle rm = new ResMoudle();
        markMapper.insertSelective(mark);
//        markMapper.insert(mark);
        return rm;
    }
}
