package com.daocheng.perfectmathematical.dao;

import com.daocheng.perfectmathematical.pojo.PTeacher;
import com.daocheng.perfectmathematical.pojo.PTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PTeacherMapper {
    long countByExample(PTeacherExample example);

    int deleteByExample(PTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PTeacher record);

    int insertSelective(PTeacher record);

    List<PTeacher> selectByExample(PTeacherExample example);

    PTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PTeacher record, @Param("example") PTeacherExample example);

    int updateByExample(@Param("record") PTeacher record, @Param("example") PTeacherExample example);

    int updateByPrimaryKeySelective(PTeacher record);

    int updateByPrimaryKey(PTeacher record);
}