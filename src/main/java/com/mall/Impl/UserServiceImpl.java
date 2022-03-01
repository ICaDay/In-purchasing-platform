package com.mall.Impl;/*
    @author Administrator
    @create 2021-07-15 21:14
*/

import com.mall.mapper.UserMapper;
import com.mall.Service.IUserService;
import com.mall.entity.ResultMap;
import com.mall.entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    UserMapper userMapper;
    @Override
    public boolean login_admin(String username, String password, ResultMap resultMap, HttpServletRequest request){
        if(username !=null && password !=null){
            Users users =new Users();
            users.setName(username);
            users.setPassword(password);
            Users login = userMapper.find(users);
            if(login == null){
                resultMap.setMessage("用户名不存在");
                return false;
            }else{
                if(password.equals(login.getPassword())){
                    resultMap.setMessage("登录成功");
                    request.getSession().setAttribute("loginUser",login);
                    return true;
                }else{
                    resultMap.setMessage("账号或密码错误");
                    return false;
                }
            }
        }
        return false;
    }
}
