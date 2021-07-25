package com.mall.Service;/*
    @author Administrator
    @create 2021-07-16 15:12
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.Company;

public interface ICompanyService {
    boolean add(Company company);
    boolean deleteCompany(String company_id);
    boolean updateCompany(String company);
    PageInfo<Company> CompanyList(int page, int limit);
}
