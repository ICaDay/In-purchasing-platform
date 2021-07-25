package com.mall.Mapper;/*
    @author Administrator
    @create 2021-07-16 15:00
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {
    List <Company> findAll();
    PageInfo <Company> CompanyList(int page, int limit);
    Integer addCompany(Company company);
    Integer deleteCompany(int company_id);
    Integer updateCompany(Company company);
}
