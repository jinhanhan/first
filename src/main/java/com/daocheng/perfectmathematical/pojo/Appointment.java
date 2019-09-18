package com.daocheng.perfectmathematical.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Value;

import java.util.Date;

@Data
public class Appointment {
    private Integer id;

    private String name;

    private String phoneNumber;

    private String grade;

    private Integer campusId;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date appointmentTime;

    private Integer status;
   //校区信息
    private Campus campus;

    //所有/已处理/未处理总数
    private Integer statusTotal;

}