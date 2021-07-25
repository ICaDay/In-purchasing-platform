package com.mall.Controller;/*
    @author Administrator
    @create 2021-07-15 11:24
*/

import com.alibaba.fastjson.JSON;
import com.mall.Service.IMemberService;
import com.mall.entity.Member;
import com.mall.entity.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Member")
public class memberController {
    @Autowired
    IMemberService memberService;
    ResultMap resultMap = new ResultMap();
    @RequestMapping("/login_all")
    @ResponseBody
    public String login_all(String username, String password, HttpServletRequest request){
        try{
            boolean result = memberService.login(username , password ,resultMap, request);
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
    public  String update_member(String member){
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
}
