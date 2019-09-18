package com.daocheng.perfectmathematical.servier;

import com.daocheng.perfectmathematical.dao.PTeacherMapper;
import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.daocheng.perfectmathematical.pojo.PTeacher;
import com.daocheng.perfectmathematical.pojo.PTeacherExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.lang.model.element.VariableElement;
import java.util.HashMap;
import java.util.List;

@Service
public class TeacherService {


    @Resource
    private PTeacherMapper teacherMapper;


    /**
     * 查询所有教师信息
     * @return
     */
    public JsonResult findAll(Integer page,Integer limit){

        PageHelper.startPage(page,limit);
        PTeacherExample example = new PTeacherExample();
        PTeacherExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<PTeacher> teachers = teacherMapper.selectByExample(example);
        PageInfo<PTeacher> pageInfo = new PageInfo<>(teachers);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("teacherData",pageInfo.getList());
        map.put("teacherTotal",pageInfo.getSize());
        return new JsonResult(200,"查询成功",map);
    }

    /**
     * 添加教师信息
     * @param teacher
     * @return
     */
    public JsonResult teacherSave(PTeacher teacher) {
        try {
            teacherMapper.insertSelective(teacher);
            return new JsonResult(200,"添加成功",null);
        }catch(Exception e){
            e.printStackTrace();
            return new JsonResult(500,"添加失败",null);
        }
    }

    /**
     * 修改教师信息
     * @param teacher 教师信息
     * @return
     */
    public JsonResult teacherModify(PTeacher teacher) {
        Integer id = teacher.getId();
        PTeacherExample example = new PTeacherExample();
        PTeacherExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        try {
            teacherMapper.updateByExampleSelective(teacher,example);
            return new JsonResult(200,"修改成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(500,"修改失败",null);
        }
    }

    /**
     * 删除教师信息
     * @param id  教师标识
     * @return
     */
    public JsonResult teacherDelte(Integer id) {
        try {
            teacherMapper.deleteByPrimaryKey(id);
            return new JsonResult(200,"删除成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(500,"删除失败",null);
        }
    }

    /**
     * 查询所有教师信息
     * @return
     */
    public JsonResult selectAll() {
        PTeacherExample example = new PTeacherExample();
        PTeacherExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<PTeacher> teachers= teacherMapper.selectByExample(example);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("teacherData",teachers);
        return new JsonResult(200,"查询完成",map);
    }
}
