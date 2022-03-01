package com.mall.Controller;/*
    @author Administrator
    @create 2021-07-15 11:24
*/

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
import com.mall.Service.IMemberService;
import com.mall.entity.Company;
import com.mall.entity.Member;
import com.mall.entity.ResultMap;
import com.mall.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/Member")
public class memberController {
    @Resource
    IMemberService memberService;
    ResultMap resultMap = new ResultMap();
    @RequestMapping("/login_all")
    @ResponseBody
    public String login_all(String username, String password, Integer Role_id, HttpServletRequest request){
        try{
            boolean result = memberService.login(username , password ,Role_id,resultMap, request);
            resultMap.setStatus(result);
        }catch (Exception e){
            e.printStackTrace();
        }
        return JSON.toJSONString(resultMap);
    }

  /*  @RequestMapping("/login_after")
    @ResponseBody
    public String login_after(String username, String password, HttpServletRequest request){
        try{
            boolean result = memberService.login_all(username , password ,resultMap, request);
            resultMap.setStatus(result);
        }catch (Exception e){
            e.printStackTrace();
        }
        return JSON.toJSONString(resultMap);
    }*/
    @RequestMapping("/delete_member")
    @ResponseBody
    public String delete_member(String member_id){
        boolean delete_member = memberService.deleteMember(member_id);
        resultMap.setStatus(delete_member);
        return  JSON.toJSONString(resultMap);
    }

    @RequestMapping("/update_member")
    @ResponseBody
    public  String update_member(Member member){
        boolean update_member=memberService.updateMember(member);
        resultMap.setStatus(update_member);
        return JSON.toJSONString(resultMap);
    }

    @RequestMapping("/add_member")
    @ResponseBody
    public String add_member(Member member){
        boolean add_member=memberService.addMember(member);
        resultMap.setStatus(add_member);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/find_member")
    @ResponseBody
    public String find_member(Integer page,Integer limit){
        PageInfo<Member> memberPageInfo = memberService.MemberList(page, limit);
        //封装分页数据
        resultMap.setList(memberPageInfo.getList());
        resultMap.setCount((int)memberPageInfo.getTotal());
        //返回分页数据
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/findId")
    @ResponseBody
    public String findId(String member_id){

        List<Member> find_Id=memberService.findId(member_id);
        resultMap.setList(find_Id);

        return JSON.toJSONString(find_Id);
    }
}
