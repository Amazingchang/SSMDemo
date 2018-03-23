package me.changjie.service;

import me.changjie.dao.UserInfoDao;
import me.changjie.entity.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create by ChangJie on 2018/3/23
 */
@Service
public class UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    public void register(UserInfo userInfo){
        userInfoDao.register(userInfo);
    }
}
