package com.aiseot.oom.markservice.dao;

import com.aiseot.oom.markservice.entity.Mark;
import com.aiseot.oom.markservice.entity.MarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkMapper {
    long countByExample(MarkExample example);

    int deleteByExample(MarkExample example);

    int insert(Mark record);

    int insertSelective(Mark record);

    List<Mark> selectByExample(MarkExample example);

    int updateByExampleSelective(@Param("record") Mark record, @Param("example") MarkExample example);

    int updateByExample(@Param("record") Mark record, @Param("example") MarkExample example);
}