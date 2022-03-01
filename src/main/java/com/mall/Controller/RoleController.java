package com.mall.Controller;/*
    @author Administrator
    @create 2021-07-27 17:03
*/

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.mall.Service.IRoleService;
import com.mall.entity.ResultMap;
import com.mall.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/Role")
public class RoleController {
    @Resource
    IRoleService roleService;
    ResultMap resultMap=new ResultMap();
    @RequestMapping("/add_role")
    @ResponseBody
    public String add_role(Role role){
        boolean add = roleService.addRole(role);
        resultMap.setStatus(add);
        return JSON.toJSONString(resultMap);
    }


    @RequestMapping("/delete_role")
    @ResponseBody

    public String delete_role(String role_id){
        boolean delete = roleService.deleteRole(role_id);
        resultMap.setStatus(delete);
        return JSON.toJSONString(resultMap);
    }

    @RequestMapping("/update_role")
    @ResponseBody
    public String update_role(String role_id){
        boolean update = roleService.updateRole(role_id);
        resultMap.setStatus(update);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/find_role")
    @ResponseBody
    public String find_role(int page,int limit){
        PageInfo<Role> rolePageInfo=roleService.RoleList(page, limit);
        resultMap.setList(rolePageInfo.getList());
        resultMap.setCount((int)rolePageInfo.getTotal());
        return JSON.toJSONString(resultMap);
    }

}
