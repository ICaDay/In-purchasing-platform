package com.mall.Impl;/*
    @author Administrator
    @create 2021-07-16 16:38
*/

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.mapper.CompanyMapper;
import com.mall.Service.ICompanyService;
import com.mall.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    CompanyMapper companyMapper;

    @Override
    public boolean add(Company company){
        if(company!=null){
            company.setStatus(0);
            int add=companyMapper.addCompany(company);
            //添加成功
            if(add==1) {
                return true;
            }
        }
        return false;
    }
    @Override
    public PageInfo<Company> CompanyList(int page, int limit){
        //开启分页
        PageHelper.startPage(page,limit);
        //得到用户列表
        List <Company> company = companyMapper.findAll();
        //创建分页数据
        PageInfo<Company> companyPageInfo = new PageInfo<>(company);
        return companyPageInfo;
    }
    @Override
    public boolean deleteCompany(String company_id){

            if(company_id != null){
                int i=companyMapper.deleteCompany(Integer.parseInt(company_id));
                if(i==1){
                    return true;
                }
            }

        return false;
    }
    @Override
    public boolean updateCompany(String company){
        if(company!=null){
            //将前端导入的json格式对象转换成java对象
            Company company1= JSON.parseObject(company,Company.class);
            int i=companyMapper.updateCompany(company1);
            if(i==1) return true;
        }
        return false;
    }
    @Override
    public List<Company> findId(Integer company_id){
        return companyMapper.findId(company_id);
    }
}
