package com.mall.Impl;/*
    @author Administrator
    @create 2021-07-19 16:19
*/

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.entity.Role;
import com.mall.mapper.MemberMapper;
import com.mall.Service.IMemberService;
import com.mall.entity.Member;
import com.mall.entity.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class MemberService implements IMemberService {
    @Autowired
    MemberMapper memberMapper;

    @Override
    public boolean login(String member_name, String member_password, Integer Role_id, ResultMap resultMap, HttpServletRequest request) {
        if (member_name != null && member_password != null && Role_id!=null) {
            Member member = new Member();
            member.setMember_name(member_name);
            member.setMember_password(member_password);
            member.setRole_id(Role_id);
            Member member_before = memberMapper.find_all(member);
            // Users login = userMapper.find(users)
            if (member_before == null) {
                resultMap.setMessage("账号或密码错误");
                return false;
            } else {
                if (member_password.equals(member_before.getMember_password())) {
                    resultMap.setCount(member_before.getMember_id());
                    resultMap.setMessage("登录成功");
                    request.getSession().setAttribute("loginUser", member_before);
                    return true;
                } else {
                    resultMap.setMessage("账号或密码错误");
                    return false;
                }
            }
        }
        return false;
    }
    @Override
    public boolean addMember(Member member){
        if(member!=null){
            member.setStatus(0);
            int add = memberMapper.addMember(member);
            if(add==1){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean deleteMember(String  member_id){
        if(member_id!=null){
            int delete = memberMapper.deleteMember(Integer.parseInt(member_id));
            if(delete==1){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean updateMember(Member member){
        if(member!=null){
            //将前端导入的json格式对象转换成java对象

            int i=memberMapper.updateMember(member);
            if(i==1) return true;
        }
        return false;
    }
    @Override
    public PageInfo<Member> MemberList(Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List <Member> members= memberMapper.findAll();
        PageInfo<Member> memberPageInfo=new PageInfo<>(members);
        return memberPageInfo;
    }
    @Override
    public List<Member>findId(String member_id){
        return memberMapper.findId(member_id);
    }
}
