package com.daocheng.perfectmathematical.pojo;

import lombok.Data;

@Data
public class BookChapter {
    private Integer id;

    private Integer bookId;

    private Integer chapterNum;

    private String chapterName;

    private Integer sysBookId;
    //年级 课本信息
    private Book book;

}