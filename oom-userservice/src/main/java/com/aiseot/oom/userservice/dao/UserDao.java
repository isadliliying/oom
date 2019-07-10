package com.aiseot.oom.userservice.dao;

import com.aiseot.oom.userservice.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface UserDao {
    User selectOneByNanmeAndPwd(HashMap<String, String> argMap);

    int insertOne(HashMap<String, String> argMap);
}
