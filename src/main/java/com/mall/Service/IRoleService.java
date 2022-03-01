package com.mall.Service;/*
    @author Administrator
    @create 2021-07-20 19:55
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.Member;
import com.mall.entity.Role;
import org.springframework.stereotype.Service;


public interface IRoleService {
    boolean addRole(Role role);
    boolean deleteRole(String role_id);
    boolean updateRole(String role_id);
    PageInfo<Role> RoleList(int page, int limit);
}
