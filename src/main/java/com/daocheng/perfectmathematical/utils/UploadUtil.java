package com.daocheng.perfectmathematical.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UploadUtil {
    /**
     * 文件上传
     */

    public static String uploadFile(MultipartFile file){
        //原文件名称
        String oldName = file.getOriginalFilename();
        //文件后缀
        String suffix = oldName.substring(oldName.lastIndexOf("."));
        //新文件名
        String newName = UUID.randomUUID().toString().replaceAll("-","")+suffix;
        //文件地址
        String site = "ftp://121.42.11.227:33";

        //文件上传
        try {
            file.transferTo(new File(site,newName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //文件路径
        String path = site+newName;

        return path;
    }


}
