package com.wkcto.dubbo.web;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "/user")
    public String userDetail(Model model, Integer id){
        //根据用户标识获取用户详情
        User user = userService.queryUserById(id);
        
        //获取用户总人数
        Integer allUserCount = userService.queryAllUserCount();
        model.addAttribute("user",user);
        model.addAttribute("allUserCount",allUserCount);

        return "userDetail";
    }
}
