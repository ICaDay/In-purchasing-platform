package com.mall.Mapper;/*
    @author Administrator
    @create 2021-07-14 18:25
*/

import com.mall.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;

@Mapper
public interface UserMapper {
    Users find(Users users);

}
