package com.mall.mapper;/*
    @author Administrator
    @create 2021-07-19 15:27
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RoleMapper {
    List<Role> findAll();
    PageInfo<Role> RoleList(int page, int limit);
    Integer addRole(Role role);
    Integer deleteRole(int role_id);
    Integer updateRole(Role role);
}
