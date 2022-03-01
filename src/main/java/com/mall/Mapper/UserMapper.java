package com.mall.mapper;/*
    @author Administrator
    @create 2021-07-14 18:25
*/

import com.mall.entity.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Users find(Users users);
}
