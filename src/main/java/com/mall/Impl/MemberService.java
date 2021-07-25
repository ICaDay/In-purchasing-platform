package com.mall.Impl;/*
    @author Administrator
    @create 2021-07-19 16:19
*/

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.Mapper.MemberMapper;
import com.mall.Service.IMemberService;
import com.mall.entity.Company;
import com.mall.entity.Member;
import com.mall.entity.ResultMap;
import com.mall.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class MemberService implements IMemberService {
    @Autowired
    MemberMapper memberMapper;

    @Override
    public boolean login(String member_name, String member_password, ResultMap resultMap, HttpServletRequest request){
        if(member_name!=null && member_password !=null){
            Member member =new Member();
            member.setMember_name(member_name);
            Member member_before=memberMapper.find_all(member);
           // Users login = userMapper.find(users);
            if(member_before == null){
                resultMap.setMessage("用户名不存在");
                return false;
            }else{
                if(member_password.equals(member_before.getMember_password())){
                    resultMap.setMessage("登录成功");
                    request.getSession().setAttribute("loginUser",member_before);
                    return true;
                }
            }
        }
        resultMap.setMessage("账号或密码错误");
        return false;
    }
/*    @Override
    public boolean login_after(String member_name, String member_password, ResultMap resultMap, HttpServletRequest request){
        if(member_name !=null && member_password !=null){
            Member member =new Member();
            member.setMember_name(member_name);
            Member Member_after = memberMapper.find_after(member);
            // Users login = userMapper.find(users);
            if( Member_after == null){
                resultMap.setMessage("用户名不存在");
                return false;
            }else{
                if(member_password.equals(Member_after.getMember_password())){
                    resultMap.setMessage("登录成功");
                    request.getSession().setAttribute("loginUser",Member_after);
                    return true;
                }
            }
        }
        resultMap.setMessage("账号或密码错误");
        return false;
    }*/
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
    public boolean updateMember(String member){
        if(member!=null){
            //将前端导入的json格式对象转换成java对象
            Member update= JSON.parseObject(member,Member.class);
            int i=memberMapper.updateMember(update);
            if(i==1) return true;
        }
        return false;
    }
    @Override
    public PageInfo<Member> MemberList(int page, int limit){
        PageHelper.startPage(page,limit);
        List <Member> members= memberMapper.findAll();
        PageInfo<Member> memberPageInfo=new PageInfo<>(members);
        return memberPageInfo;
    }
}
