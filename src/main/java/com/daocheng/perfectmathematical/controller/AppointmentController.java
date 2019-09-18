package com.daocheng.perfectmathematical.controller;

import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.daocheng.perfectmathematical.servier.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/appoint")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    /**
     * 分页查询用户预约信息并关联校区
     * @param page 总页数
     * @param size 每页显示条数
     * @param status 状态码 -1/0/1  所有/未处理/已处理  默认未处理
     * @return
     */
    @GetMapping("/sybase")
    public JsonResult pageQuery(@RequestParam("page") Integer page,@RequestParam("size") Integer size,@RequestParam("status") Integer status){
           return appointmentService.pageQueryAll(page,size,status);
    }

    /**
     * 处理/未处理 预约用户信息
     * @param map 封装用户标识id
     */
    @PostMapping("/manage")
    public JsonResult manageAppointment(@RequestBody Map<String,Integer> map){

        Integer id = map.get("id");
        return appointmentService.manageAppointment(id);
    }

}
