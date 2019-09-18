package com.daocheng.perfectmathematical.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Book {
    private Integer id;

    private Integer grade;

    private String bookName;

    //章节信息
    private List<BookChapter> chapters;


}