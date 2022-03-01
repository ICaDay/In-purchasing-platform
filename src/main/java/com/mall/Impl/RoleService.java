package com.mall.Impl;/*
    @author Administrator
    @create 2021-07-27 16:52
*/

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.mapper.RoleMapper;
import com.mall.Service.IRoleService;
import com.mall.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public boolean addRole(Role role){
        if(role!=null){
            role.setStatus(0);
            int add = roleMapper.addRole(role);
            if(add==1){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean deleteRole(String  role_id){
        if(role_id!=null){
            int delete = roleMapper.deleteRole(Integer.parseInt(role_id));
            if(delete==1){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean updateRole(String role_id){
        if(role_id!=null){
            //将前端导入的json格式对象转换成java对象
            Role update= JSON.parseObject(role_id,Role.class);
            int i=roleMapper.updateRole(update);
            if(i==1) return true;
        }
        return false;
    }
    @Override
    public PageInfo<Role> RoleList(int page, int limit){
        PageHelper.startPage(page,limit);
        List<Role> roleList = roleMapper.findAll();
        PageInfo<Role> rolePageInfo=new PageInfo<>(roleList);
        return rolePageInfo;
    }
}
