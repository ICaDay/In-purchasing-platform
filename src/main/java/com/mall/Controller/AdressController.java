package com.mall.Controller;/*
    @author Administrator
    @create 2021-10-04 15:26
*/

import com.alibaba.fastjson.JSON;
import com.mall.Service.AdressService;
import com.mall.entity.Adress;
import com.mall.entity.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Adress")
public class AdressController {
    @Autowired
    AdressService adressService;
    ResultMap resultMap = new ResultMap();
    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
        List<Adress> adresses=adressService.findAll();
        resultMap.setList(adresses);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/address")
    @ResponseBody
    public String address(Adress adress){
        boolean add = adressService.address(adress);
        resultMap.setStatus(add);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/deleteaddress")
    @ResponseBody
    public String deleteaddress(String Adress_id){
        boolean delete = adressService.deleteaddress(Adress_id);
        resultMap.setStatus(delete);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/updateaddress")
    @ResponseBody
    public String updateaddress(Adress adress){
        boolean update=adressService.updateaddress(adress);
        resultMap.setStatus(update);
        return JSON.toJSONString(update);
    }
    @RequestMapping("/findId")
    @ResponseBody
    public String findId(String member_id){
        List<Adress> findId=adressService.findId(member_id);
        resultMap.setList(findId);
        return JSON.toJSONString(resultMap);
    }
}
