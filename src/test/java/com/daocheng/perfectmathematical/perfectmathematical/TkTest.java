package com.daocheng.perfectmathematical.perfectmathematical;

import com.daocheng.perfectmathematical.pojo.PBanner;
import com.daocheng.perfectmathematical.pojo.PTeacher;
import com.daocheng.perfectmathematical.pojo.SysUser;
import com.daocheng.perfectmathematical.servier.BannerService;
import com.daocheng.perfectmathematical.servier.PCourseService;
import com.daocheng.perfectmathematical.servier.TeacherService;
import com.daocheng.perfectmathematical.servier.UserServier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TkTest {
    @Resource
    private UserServier userService;

    @Autowired
    private BannerService bannerService;

    @Autowired
    private PCourseService pCourseService;

    @Autowired
    private TeacherService teacherService;


    @Test
    public void test(){
        List<SysUser> users = userService.findAll();
        for (SysUser user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test2(){
        List<PBanner> banners = bannerService.selectAll();
        for (PBanner user : banners) {
            System.out.println(user);
        }
    }






}
