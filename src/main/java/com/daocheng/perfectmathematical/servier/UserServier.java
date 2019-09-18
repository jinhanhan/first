package com.daocheng.perfectmathematical.servier;

import com.daocheng.perfectmathematical.dao.UserDao;
import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.daocheng.perfectmathematical.pojo.SysUser;
import com.daocheng.perfectmathematical.utils.GetTokenUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServier {
    @Resource
    private UserDao userDao;

    /**
     * 查询所有usre数据
     */
   public List<SysUser> findAll(){
       return userDao.findAll();
    }

    /**
     * 用户登录 并返回token
     * @param name
     * @param password
     * @return
     */
    public JsonResult userLogin(String name, String password) {
        SysUser user = userDao.userLogin(name,password);
        if(user == null){
            return new JsonResult(500,"用户名或者密码不正确，请重试",null);
        } else{
            String token = GetTokenUtils.getToken(user);
            System.out.println(token);
            HashMap<String, Object> map = new HashMap<>();
            map.put("token",token);
            return new JsonResult(200,"登录成功",map);
        }
    }
}
