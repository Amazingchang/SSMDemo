package me.changjie.controller;

import me.changjie.entity.UserInfo;
import me.changjie.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Create by ChangJie on 2018/3/23
 */
@Controller
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;


    @RequestMapping(value = "register")
    @ResponseBody
    public String register(UserInfo userInfo,
                           @RequestPart(value = "profilePicture") MultipartFile profilePicture,
                           HttpServletRequest request) throws IOException {

        // 上传文件
        String basePath = request.getSession().getServletContext().getRealPath("/");
        // 文件夹全路径
        String fullFolderPath = basePath + File.separator + "upload";
        File outFolder = new File(fullFolderPath);
        if (!outFolder.exists()) {
            outFolder.mkdirs();
        }

        // 文件全路径
        String fullFilePath = fullFolderPath + File.separator + profilePicture.getOriginalFilename();
        File saveFile = new File(fullFilePath);
        profilePicture.transferTo(saveFile);

        userInfo.setPhoto(fullFilePath);
        userInfo.setCreateTime(new Date());
        userInfoService.register(userInfo);

        System.out.println(userInfo);

        return "success";
    }
}
