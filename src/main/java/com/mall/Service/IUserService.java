package com.mall.Service;/*
    @author Administrator
    @create 2021-07-14 18:26
*/

import com.mall.entity.ResultMap;
import com.mall.entity.Users;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

public interface IUserService {
    boolean login_admin(String username, String password, ResultMap resultMap, HttpServletRequest request);

}
