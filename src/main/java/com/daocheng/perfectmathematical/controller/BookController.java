package com.daocheng.perfectmathematical.controller;

import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.daocheng.perfectmathematical.servier.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 级联查询必修课程及目录章节
     */
    @GetMapping("/select_cas")
    public JsonResult selectCascade(){
        return bookService.selectCascade();
    }

    /**
     * 根据年级查询所有课本信息
     * @param map  封装年级id
     * @return
     */
    @PostMapping("/select_gradeid")
    public JsonResult selectBookByGradeId(@RequestBody Map<String,Integer> map){
        Integer gradeId = map.get("gradeId");
        return bookService.selectBookByGradeId(gradeId);
    }

}
