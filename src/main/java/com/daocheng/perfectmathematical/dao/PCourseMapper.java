package com.daocheng.perfectmathematical.dao;

import com.daocheng.perfectmathematical.pojo.PCourse;
import com.daocheng.perfectmathematical.pojo.PCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PCourseMapper {
    long countByExample(PCourseExample example);

    int deleteByExample(PCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PCourse record);

    int insertSelective(PCourse record);

    List<PCourse> selectByExample(PCourseExample example);

    PCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PCourse record, @Param("example") PCourseExample example);

    int updateByExample(@Param("record") PCourse record, @Param("example") PCourseExample example);

    int updateByPrimaryKeySelective(PCourse record);

    int updateByPrimaryKey(PCourse record);
    //自定义保存
    void insertSelective2(PCourse course);
    //分页按条件查询所有课程信息关联教师、章节信息
    List<PCourse> selectCourseCascadeAll(@Param("status") Integer status, @Param("gradeId") Integer gradeId, @Param("bookId") Integer bookId, @Param("chapterId") Integer chapterId,@Param("keyWords") String keyWords);
    //根据年级查询课程信息
    List<PCourse> selectCourseByGradeId(Integer gradeId);
}