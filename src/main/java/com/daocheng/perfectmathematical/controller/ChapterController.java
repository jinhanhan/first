package com.daocheng.perfectmathematical.controller;

import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.daocheng.perfectmathematical.servier.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ReactiveTypeDescriptor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/chapter")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    /**
     * 根据课本查询所有章节信息
     * @param map 封装章节id
     */
    @PostMapping("/select_by_bookid")
    public JsonResult selectChapterByBookId(@RequestBody Map<String,Integer> map){
        Integer bookId = map.get("bookId");
        return chapterService.selectChapterByBookId(bookId);
    }

}
