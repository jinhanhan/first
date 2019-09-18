package com.daocheng.perfectmathematical.servier;

import com.daocheng.perfectmathematical.dao.AppointmentMapper;
import com.daocheng.perfectmathematical.pojo.Appointment;
import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppointmentService {
    @Resource
    private AppointmentMapper appointmentMapper;

    /**
     * 分页查询用户预约信息并关联校区
     * @param page 总页数
     * @param size 每页显示条数
     * @param status 状态码 -1/0/1  所有/未处理/已处理  默认未处理
     * @return
     */
    public JsonResult pageQueryAll(Integer page, Integer size, Integer status) {
        PageHelper.startPage(page,size);
        List<Appointment> appointments = appointmentMapper.selectByPage(status);
        PageInfo<Appointment> pageInfo = new PageInfo<Appointment>(appointments);
        Map<String,Object> map = new HashMap<>();
        map.put("appointmentList",pageInfo.getList());
        map.put("total",pageInfo.getSize());
        return new JsonResult(200,"分页查询成功",map);
    }

    /**
     *处理/未处理 预约用户信息
     * @param id 用户标识id
     */
    public JsonResult manageAppointment(Integer id) {
        Appointment appointment = appointmentMapper.selectByPrimaryKey(id);
        if (appointment.getStatus() == 0){
            appointment.setStatus(1);
        }else{
            appointment.setStatus(0);
        }
        appointmentMapper.updateByPrimaryKeySelective(appointment);
        return new JsonResult(200,"用户信息操作成功",null);
    }
}
