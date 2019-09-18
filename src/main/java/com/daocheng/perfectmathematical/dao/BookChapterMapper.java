package com.daocheng.perfectmathematical.dao;

import com.daocheng.perfectmathematical.pojo.BookChapter;
import com.daocheng.perfectmathematical.pojo.BookChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookChapterMapper {
    long countByExample(BookChapterExample example);

    int deleteByExample(BookChapterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookChapter record);

    int insertSelective(BookChapter record);

    List<BookChapter> selectByExample(BookChapterExample example);

    BookChapter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookChapter record, @Param("example") BookChapterExample example);

    int updateByExample(@Param("record") BookChapter record, @Param("example") BookChapterExample example);

    int updateByPrimaryKeySelective(BookChapter record);

    int updateByPrimaryKey(BookChapter record);
}