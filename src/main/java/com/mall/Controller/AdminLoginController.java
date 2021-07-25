package com.mall.Controller;/*
    @author Administrator
    @create 2021-07-13 11:05
*/

import com.alibaba.fastjson.JSON;
import com.mall.entity.ResultMap;
import com.mall.entity.Users;
import com.mall.Service.IUserService;
import com.mall.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequestMapping("/admin")
@Controller
public class AdminLoginController {

    @Autowired
    IUserService userService;
    ResultMap resultMap = new ResultMap();
    @RequestMapping("/login_admin")
    @ResponseBody
    public String login_admin(String username, String password, HttpServletRequest request){
        try{
            boolean result = userService.login_admin(username, password,resultMap,request);
            resultMap.setStatus(result);
        }catch (Exception e){
            e.printStackTrace();
        }
        return JSON.toJSONString(resultMap);
    }
}
