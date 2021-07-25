package com.mall.Controller;/*
    @author Administrator
    @create 2021-07-16 14:50
*/

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.mall.Service.ICompanyService;
import com.mall.entity.Company;
import com.mall.entity.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Company_information")
public class CompanyController {
    @Autowired
    ICompanyService companyService;
    ResultMap resultMap=new ResultMap();

    @RequestMapping("/find_company")
    @ResponseBody
    public String find_company(int page,int limit){
        PageInfo<Company> companyPageInfo =companyService.CompanyList(page,limit);
        //封装分页数据
        resultMap.setList(companyPageInfo.getList());
        resultMap.setCount((int)companyPageInfo.getTotal());
        //返回分页数据
        return JSON.toJSONString(resultMap);
    }

    @RequestMapping("/add_company")
    @ResponseBody
    public String add_company(Company company){
        boolean add_com = companyService.add(company);
        resultMap.setStatus(add_com);
        return JSON.toJSONString(resultMap);
    }


    @RequestMapping("/deleteCompany")
    @ResponseBody

    public String deleteCompany(String company_id){
        boolean delete_com = companyService.deleteCompany(company_id);
        resultMap.setStatus(delete_com);
        return JSON.toJSONString(resultMap);
    }

    @RequestMapping("/updateCompany")
    @ResponseBody

    public String updateCompany(String company1){
        boolean update_com = companyService.updateCompany(company1);
        resultMap.setStatus(update_com);
        return JSON.toJSONString(resultMap);
    }
}
