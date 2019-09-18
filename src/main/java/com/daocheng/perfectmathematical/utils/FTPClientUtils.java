package com.daocheng.perfectmathematical.utils;


import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * FTP文件上传下载工具类
 * @author fh
 */
@Component
public class FTPClientUtils {
    //ftp服务器ip地址
    private static final String FTP_ADDRESS = "121.42.11.227";
    //端口号
    private static final int FTP_PORT = 33;
    //用户名
    private static final String FTP_USERNAME = "daocheng";
    //密码
    private static final String FTP_PASSWORD = "daocheng0933";
    //图片路径
    private static final String FTP_BASEPATH = "http://121.42.11.227:9877/file-bucket/";

    public static String uploadFile(MultipartFile file){
        String path = null;
        //文件名
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString().replaceAll("-","")+suffix;

        FTPClient ftp = new FTPClient();
        ftp.setControlEncoding("UTF-8");
        try {
            int reply;
            ftp.connect(FTP_ADDRESS, FTP_PORT);// 连接FTP服务器
            ftp.login(FTP_USERNAME, FTP_PASSWORD);// 登录
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
            }
            ftp.enterLocalPassiveMode();
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
//            ftp.makeDirectory(FTP_BASEPATH );
            ftp.changeWorkingDirectory("/temp-dir");
            InputStream input = file.getInputStream();
            ftp.storeFile(newFileName,input);
            ftp.rename(newFileName,"/"+newFileName);
            input.close();
            ftp.logout();
            path = FTP_BASEPATH+newFileName;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return path;
    }


}
