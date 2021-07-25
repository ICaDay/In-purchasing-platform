package com.mall.Mapper;/*
    @author Administrator
    @create 2021-07-15 11:46
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;
import java.util.List;

@Mapper
public interface MemberMapper {
    List <Member> findAll();
    PageInfo<Member> MemberList(int page, int limit);

    Integer addMember(Member member);
    Integer deleteMember(int member_id);
    Integer updateMember(Member member);
    Member find_all(Member member);
   // Member find_after(Member member);


}
