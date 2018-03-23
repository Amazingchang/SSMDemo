package me.changjie.controller;

import me.changjie.entity.UserInfo;
import me.changjie.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
    public String register(UserInfo userInfo){

        userInfo.setCreateTime(new Date());
        System.out.println(userInfo);
        userInfoService.register(userInfo);
        return "success";
    }
}
