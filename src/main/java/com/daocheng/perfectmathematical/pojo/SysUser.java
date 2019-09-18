package com.daocheng.perfectmathematical.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUser {

    private Integer id;
    private String name;
    private String password;

}
