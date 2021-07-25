package com.mall.Mapper;/*
    @author Administrator
    @create 2021-07-19 15:27
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.Member;
import com.mall.entity.Role;

import java.util.List;

public interface RoleMapper {
    List<Role> findAll();
    PageInfo<Role> RoleList(int page, int limit);
    Integer addRole(Role role);
    Integer deleteRole(int role_id);
    Integer updateRole(Role role);
}
