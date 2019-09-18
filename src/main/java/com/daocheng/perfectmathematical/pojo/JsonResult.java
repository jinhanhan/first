package com.daocheng.perfectmathematical.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult {

    private Integer status;

    private String message;

    private Object data;


}
