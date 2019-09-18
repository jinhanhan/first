package com.daocheng.perfectmathematical.servier;

import com.daocheng.perfectmathematical.dao.PBannerMapper;
import com.daocheng.perfectmathematical.pojo.JsonResult;
import com.daocheng.perfectmathematical.pojo.PBanner;
import com.daocheng.perfectmathematical.pojo.PBannerExample;
import com.daocheng.perfectmathematical.pojo.PCourse;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BannerService {

    @Resource
    private PBannerMapper bannerMapper;

    /**
     * 图片是否禁用
     * @param id v 图片id
     * @return
     */
    public Integer isStartUse(Integer id) {
        PBannerExample example = new PBannerExample();
        PBannerExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        PBanner banner = (bannerMapper.selectByExample(example)).get(0);
        Integer ban = banner.getEnable();
        // 0：默认禁用 enable==0时 ===》修改enable==1 启用
        if(ban == 0){
            bannerMapper.updateById(id,ban);
        }else{
            //enable ==1时 ====》修改enable==0 禁用
            bannerMapper.updateById(id,ban);
        }
        return ban;
    }

    /**
     * 删除图片
     * @param id 图片id
     */
    public void imageDel(Integer id) {
        PBannerExample example = new PBannerExample();
        PBannerExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        try{
            bannerMapper.deleteByExample(example);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 图片查询所有
     * @return
     */
    public List<PBanner> selectAll() {
        PBannerExample example = new PBannerExample();
        PBannerExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<PBanner> banners = bannerMapper.selectByExample(example);
        return banners;
    }

    /**
     * 图片保存
     * @param imageUrl 图片地址
     * @return
     */
    public JsonResult imageSave(String imageUrl) {
        PBanner banner = new PBanner();
        banner.setImageUrl(imageUrl);
        try{
            bannerMapper.insertSelective(banner);
            return new JsonResult(200,"图片保存成功",null);
        }catch(Exception e){
            e.printStackTrace();
            return new JsonResult(500,"图片保存失败",null);
        }

    }
}
