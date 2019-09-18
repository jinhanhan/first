package com.daocheng.perfectmathematical.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PCourse {
    private Integer id;

    private Integer teacherId;

    private Integer chapterId;

    private String coverSquareUrl;

    private String coverRectangleUrl;

    private String title;

    private String description;

    private String details;

    private BigDecimal price;

    private Integer studyNumber;

    private Integer purchasesNumber;

    private Integer starNumber;

    private String videoUrl;

    private Integer enable;

    //教师信息
    private PTeacher teacher;
    //章节信息
    private BookChapter bookChapter;

}