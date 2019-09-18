package com.daocheng.perfectmathematical.controller;

import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.daocheng.perfectmathematical.pojo.PBanner;
import com.daocheng.perfectmathematical.pojo.PCourse;
import com.daocheng.perfectmathematical.servier.BannerService;
import com.daocheng.perfectmathematical.servier.PCourseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RequestMapping("/course")
@RestController
public class PCourseController {

    @Autowired
    private PCourseService pCourseService;

    @Resource
    private BannerService bannerService;

    /**
     * ftp 文件上传
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public JsonResult uploadFile(@RequestParam("file") MultipartFile file){
        // url 不能为空
        String url = pCourseService.uploadFile(file);
        if(StringUtils.isBlank(url)){
            return new JsonResult(500,"上传失败，请检查网络",null);
        }else{
            return new JsonResult(200,"上传成功",url);
        }
    }

    /**
     * 图片是否禁用
     * @param id 图片id
     * @return
     */
    @GetMapping("/is_use")
    public JsonResult isStartUse(@RequestParam("id") Integer id){

        Integer ban = bannerService.isStartUse(id);
        if (ban == 0){
            return new JsonResult(200,"已启用",null);
        }else {
            return new JsonResult(200,"已禁用",null);
        }

    }

    /**
     * 图片删除
     * @param id  图片id
     */
    @GetMapping("/del")
    public JsonResult imageDel(@RequestParam("id") Integer id){
        bannerService.imageDel(id);
        return new JsonResult(200,"删除成功",null);
    }


    /**
     * 图片查询
     */
    @GetMapping("/select_banner_all")
    public JsonResult selectAll(){
        List<PBanner> banners = bannerService.selectAll();
        return new JsonResult(200,"查询成功",banners);
    }

    /**
     * 图片保存
     * @param
     * @return
     */
    @PostMapping("/image_save")
    public JsonResult imageSave(@RequestBody  Map<String,String> laJi){
        String imageUrl = laJi.get("imageUrl");
        return bannerService.imageSave(imageUrl);
    };

    /**
     * 课程查询所有
     * @return
     */
    @GetMapping("/select_course_all")
    public JsonResult selectCourseAll(){
        List<PCourse> pCourses = pCourseService.selectCourseAll();
        return new JsonResult(200,"查询完成",pCourses);
    }

    /**
     * 分页按条件查询所有课程信息关联教师、章节信息 （搜索查询）
     * @param map
     * @return
     */
    @PostMapping("/select_cascade")
    public JsonResult selectCascadeAll(@RequestBody Map<String,Object> map){
        Integer page = (Integer) map.get("page"); //当前页
        Integer limit = (Integer) map.get("limit"); //每页显示条数
        Integer status = (Integer) map.get("status"); //课程状态
        Integer gradeId = (Integer) map.get("gradeId"); //年级id
        Integer bookId = (Integer) map.get("bookId"); //书籍id（必修/选修）
        Integer chapterId = (Integer) map.get("chapterId");//章节id
        String keyWords = (String)map.get("keyWords"); //关键词

        return pCourseService.selectCourseCascadeAll(page,limit,status,gradeId,bookId,chapterId,keyWords);


    }

    /**
     * 保存(添加)课程信息
     */
    @PostMapping("/course_save")
    public JsonResult courseSave(@RequestBody PCourse course){
       return pCourseService.courseSave(course);
    }

    /**
     * 修改课程信息
     * @param course 课程信息
     */
    @PostMapping("/course_modify")
    public JsonResult courseModify(@RequestBody PCourse course){
        return pCourseService.courseModify(course);
    }

    /**
     * 删除课程信息
     * @param  id 课程id
     */
    @PostMapping("/course_del")
    public JsonResult courseDelete(@RequestParam("id") Integer id){
        return pCourseService.courseDelete(id);
    }

    /**
     * 设置课程状态
     * @param map 封装课程标识（id）
     */
    @PostMapping("/set_status")
    public JsonResult setCourseStatus(@RequestBody Map<String,Integer> map){
        Integer id = map.get("id");
        return pCourseService.setCourseStatus(id);
    }

    /**
     * 根据年级查询所有课程信息
     * @param map 高一/高二/高三
     */
    @PostMapping("/select_gradeid")
    public JsonResult selectCourseByGradeId(@RequestBody Map<String,Integer> map){
        Integer gradeId = map.get("gradeId");
        return pCourseService.selectCourseByGradeId(gradeId);
    }

}
