package com.daocheng.perfectmathematical.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.daocheng.perfectmathematical.pojo.SysUser;
import jdk.nashorn.internal.parser.Token;

public class GetTokenUtils {

    public static String getToken(SysUser user){

        String Token = JWT.create().withAudience(user.getName(),user.getPassword())
                .sign(Algorithm.HMAC256(user.getPassword()));

        return Token;
    }
}
