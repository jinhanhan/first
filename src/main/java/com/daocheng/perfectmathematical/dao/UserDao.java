package com.daocheng.perfectmathematical.dao;

import com.daocheng.perfectmathematical.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

   List<SysUser> findAll();
    //根据用户名和密码登录
    SysUser userLogin(@Param("name") String name, @Param("password") String password);
}
