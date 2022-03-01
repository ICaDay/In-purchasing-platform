package com.mall.mapper;/*
    @author Administrator
    @create 2021-10-04 12:49
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.Adress;
import com.mall.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AdressMapper {
    List<Adress> findAll();
    Integer address(Adress adress);
    Integer deleteaddress(Integer Adress_id);
    Integer updateaddress(Adress adress);
    List<Adress> findId(String member_id);
}
