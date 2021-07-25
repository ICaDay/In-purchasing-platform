package com.mall.Service;/*
    @author Administrator
    @create 2021-07-15 11:47
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.Member;
import com.mall.entity.ResultMap;

import javax.servlet.http.HttpServletRequest;

public interface IMemberService {
    boolean login(String member_name, String member_password, ResultMap resultMap,HttpServletRequest request);
    boolean addMember(Member member);
    boolean deleteMember(String member_id);
    boolean updateMember(String member);
    PageInfo<Member> MemberList(int page, int limit);
}
