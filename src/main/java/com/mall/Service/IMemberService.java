package com.mall.Service;/*
    @author Administrator
    @create 2021-07-15 11:47
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.Member;
import com.mall.entity.ResultMap;
import com.mall.entity.Role;
import com.mall.entity.invoice;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IMemberService {
    boolean login(String member_name, String member_password, Integer Role_id, ResultMap resultMap, HttpServletRequest request);
    boolean addMember(Member member);
    boolean deleteMember(String member_id);
    boolean updateMember(Member member);
    PageInfo<Member> MemberList(Integer page, Integer limit);
    List<Member> findId(String member_id);
}
