package com.daocheng.perfectmathematical.dao;

import com.daocheng.perfectmathematical.pojo.PBanner;
import com.daocheng.perfectmathematical.pojo.PBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import javax.persistence.Id;

public interface PBannerMapper {
    long countByExample(PBannerExample example);

    int deleteByExample(PBannerExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("enable") Integer enable);

    int insert(PBanner record);

    int insertSelective(PBanner record);

    List<PBanner> selectByExample(PBannerExample example);

    PBanner selectByPrimaryKey(@Param("id") Integer id, @Param("enable") Integer enable);

    int updateByExampleSelective(@Param("record") PBanner record, @Param("example") PBannerExample example);

    int updateByExample(@Param("record") PBanner record, @Param("example") PBannerExample example);

    int updateByPrimaryKeySelective(PBanner record);

    int updateByPrimaryKey(PBanner record);
    //图片是否禁用
    void updateById(@Param("id") Integer id,@Param("ban") Integer ban);
}