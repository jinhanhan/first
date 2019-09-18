package com.daocheng.perfectmathematical.servier;

import com.daocheng.perfectmathematical.dao.PCourseMapper;
import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.daocheng.perfectmathematical.pojo.PCourse;
import com.daocheng.perfectmathematical.pojo.PCourseExample;
import com.daocheng.perfectmathematical.utils.FTPClientUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PCourseService {

    @Resource
    private PCourseMapper courseMapper;
    @Resource
    private FTPClientUtils ftpClientUtils;

    /**
     * ftp 文件上传
     * @param file
     * @return
     */
    public String uploadFile(MultipartFile file) {

        String path = ftpClientUtils.uploadFile(file);
        return  path;

    }

    /**
     * 查询所有课程
     * @return
     */
    public List<PCourse> selectCourseAll() {
        PCourseExample example = new PCourseExample();
        PCourseExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        return courseMapper.selectByExample(example);
    }

    /**
     * 保存(添加)课程信息
     * @param course
     * @return
     */
    public JsonResult courseSave(PCourse course) {
//        try {
           courseMapper.insertSelective(course);
           return new JsonResult(200,"保存成功",null);
//        }catch (Exception e){
//            e.printStackTrace();
//            return new JsonResult(500,"保存失败，请检查网络",null);
//        }
    }

    /**
     * 修改课程信息
     * @param course 要修改的课程信息
     * @return
     */
    public JsonResult courseModify(PCourse course) {
        Integer id = course.getId();
        System.out.println("id:"+id);
        PCourseExample example = new PCourseExample();
        PCourseExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        try {
//            courseMapper.updateByPrimaryKeySelective(course);
            courseMapper.updateByExampleSelective(course,example);
            return new JsonResult(200,"修改成功",null);
        }catch(Exception e){
            e.printStackTrace();
            return new JsonResult(500,"修改失败",null);
        }

    }

    /**
     * 删除课程信息
     * @param id  课程id
     * @return
     */
    public JsonResult courseDelete(Integer id) {
        try {
            courseMapper.deleteByPrimaryKey(id);
            return new JsonResult(200,"删除成功",null);
        }catch(Exception e) {
            e.printStackTrace();
            return new JsonResult(200,"删除失败",null);
        }

    }

    /**
     * 分页按条件查询所有课程信息关联教师、章节信息 （搜索查询）
     * @param page
     * @param limit
     * @param status
     * @param gradeId
     * @param bookId
     * @param chapterId
     * @param keyWords
     * @return
     */
    public JsonResult selectCourseCascadeAll(Integer page, Integer limit, Integer status, Integer gradeId, Integer bookId, Integer chapterId, String keyWords) {
        PageHelper.startPage(page,limit);
        List<PCourse> pCourses = courseMapper.selectCourseCascadeAll(status,gradeId,bookId,chapterId,keyWords);
        PageInfo<PCourse> pageInfo = new PageInfo<>(pCourses);
        Map<String,Object> map = new HashMap<>();
        map.put("courseData",pageInfo.getList());
        map.put("courseTotal",pageInfo.getSize());
        return new JsonResult(200,"查询数据成功",map);
    }

    /**
     * 设置课程状态
     * @param id 课程id
     * @return
     */
    public JsonResult setCourseStatus(Integer id) {

        PCourse course = courseMapper.selectByPrimaryKey(id);
        if(course.getEnable() == 0){
            course.setEnable(1);
        }else{
            course.setEnable(0);
        }
        try {
            courseMapper.updateByPrimaryKey(course);
            return new  JsonResult(200,"课程状态设置成功",null);
        } catch(Exception e){
            e.printStackTrace();
            return new  JsonResult(500,"操作失败",null);
        }

    }

    /**
     * 根据年级查询所有课程信息
     * @param gradeId  年级 id
     * @return
     */
    public JsonResult selectCourseByGradeId(Integer gradeId) {
        List<PCourse> courses = courseMapper.selectCourseByGradeId(gradeId);
        Map<String,Object> map = new HashMap<>();
        map.put("courseData",courses);
         return new JsonResult(200,"查询数据成功",map);
    }
}
