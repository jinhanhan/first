package com.daocheng.perfectmathematical.controller;

import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.daocheng.perfectmathematical.pojo.PTeacher;
import com.daocheng.perfectmathematical.servier.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

   @Autowired
   private TeacherService teacherService;

    /**
     * 分页查询所有教师信息
     * @param map 分页数据
     */
    @PostMapping("/select_all")
    public JsonResult findAll(@RequestBody Map<String,Integer> map){
        return teacherService.findAll(map.get("page"),map.get("limit"));
    }

    /**
     * 查询所有教师信息
     */
    @GetMapping("/select_tea_info")
    public JsonResult selectTeacherInfo(){
        return teacherService.selectAll();
    }

    /**
     *添加教师信息
     * @param teacher 教师信息
     */
    @PostMapping("/save")
    public JsonResult teacherSave(@RequestBody PTeacher teacher){
        return teacherService.teacherSave(teacher);
    }

    /**
     * 修改教师信息
     * @param teacher 教师信息
     */
     @PostMapping("/modify")
    public JsonResult teacherModif(@RequestBody PTeacher teacher){
         return teacherService.teacherModify(teacher);
     }

    /**
     * 删除教师信息
     * @param map 封装教师标识
     */
    @PostMapping("/del")
    public JsonResult teacherDelete(@RequestBody Map<String,Integer> map){
        Integer id = map.get("id");
        return teacherService.teacherDelte(id);
    }
}
