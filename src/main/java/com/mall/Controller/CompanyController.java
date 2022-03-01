package com.mall.Controller;/*
    @author Administrator
    @create 2021-07-16 14:50
*/

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.mall.Service.ICompanyService;
import com.mall.entity.Company;
import com.mall.entity.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/Company_information")
public class CompanyController {
    @Resource
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
    @RequestMapping("/findId")
    @ResponseBody
    public String findId(Integer company_id, Model model) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        List<Company> findId=companyService.findId(company_id);
        model.addAttribute("findId",findId);
        String str=mapper.writeValueAsString(model);
        return str;
    }
}
