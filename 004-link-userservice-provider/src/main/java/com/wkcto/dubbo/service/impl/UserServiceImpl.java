package com.wkcto.dubbo.service.impl;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.service.UserService;

public class UserServiceImpl implements UserService {


    @Override
    public User queryUserById(Integer id) {
        //根据用户标识查询用户
        User user = new User();
        user.setUsername("zhangsan");
        user.setId(id);
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        //查询用户总书
        return 52;
    }
}
