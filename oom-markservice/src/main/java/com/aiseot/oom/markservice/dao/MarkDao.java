package com.aiseot.oom.markservice.dao;

import com.aiseot.oom.markservice.entity.Mark;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MarkDao {
    Mark selectOneByNanmeAndPwd(HashMap<String, String> argMap);

    int insertOne(HashMap<String, String> argMap);
}
