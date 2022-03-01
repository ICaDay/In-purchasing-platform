package com.mall.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.Service.IMmall_attribute_keyService;
import com.mall.Service.IStoresService;
import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Stores;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/*
@author 
@create 2021-07-25-15:26
*/

@RequestMapping("/admin/mmall_attribute_key")
@Controller


public class AdminMmall_attribute_keyController {
    @Resource
    private IMmall_attribute_keyService mmall_attribute_keyService;
    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String list(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_attribute_key> mmall_attribute_keyList = mmall_attribute_keyService.list();
        model.addAttribute("mmall_attribute_keyList",mmall_attribute_keyList);
        String str = mapper.writeValueAsString(model);
        return str;
    }
    @RequestMapping(value = "/add_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_show(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_attribute_key> mmall_attribute_keyList = mmall_attribute_keyService.list();
        model.addAttribute("Mmall_attribute_keyList",mmall_attribute_keyList);
        String str = mapper.writeValueAsString(model);
        return str;
    }


    @RequestMapping(value = "/add_submit" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_submit(Mmall_attribute_key mmall_attribute_key) throws JsonProcessingException{
        //mmall_attribute_key = new Mmall_attribute_key();
        //mmall_attribute_key.setAttribute_name("ceshi");
        //mmall_attribute_key.setCategory_id(8);
        //mmall_attribute_key.setId(4);
        //mmall_attribute_key.setName_sort(4);
        mmall_attribute_keyService.insert(mmall_attribute_key);
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_attribute_key> mmall_attribute_keyList = mmall_attribute_keyService.list();
        String str = mapper.writeValueAsString(mmall_attribute_keyList);
        return str;
    }

    @RequestMapping(value = "/update_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_show(Integer id,Model model)throws JsonProcessingException{
        Mmall_attribute_key mmall_attribute_key = mmall_attribute_keyService.find(id);
        model.addAttribute("Mmall_attribute_key",mmall_attribute_key);
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(model);
        return str;
    }

    @RequestMapping(value = "/update_submit",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_submit(Mmall_attribute_key mmall_attribute_key)throws JsonProcessingException{
        mmall_attribute_keyService.update(mmall_attribute_key);
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_attribute_key> mmall_attribute_keyList = mmall_attribute_keyService.list();
        String str =mapper.writeValueAsString(mmall_attribute_keyList);
        return str;
    }

    @RequestMapping(value = "/keylist",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String keylist(Integer categoryId) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        //categoryId = 8;
        List<Mmall_attribute_key> mmall_attribute_keyList = mmall_attribute_keyService.keylist(categoryId);
        String str= mapper.writeValueAsString(mmall_attribute_keyList);
        return str;
    }
}
