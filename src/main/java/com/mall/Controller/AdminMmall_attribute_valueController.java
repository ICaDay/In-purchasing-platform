package com.mall.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.Service.IMmall_attribute_keyService;
import com.mall.Service.IMmall_attribute_valueService;
import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Mmall_attribute_value;
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

@RequestMapping("/admin/mmall_attribute_value")
@Controller


public class AdminMmall_attribute_valueController {
    @Resource
    private IMmall_attribute_valueService mmall_attribute_valueService;
    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String list(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_attribute_value> mmall_attribute_valueList = mmall_attribute_valueService.list();
        model.addAttribute("mmall_attribute_keyList",mmall_attribute_valueList);
        String str = mapper.writeValueAsString(model);
        return str;
    }
    @RequestMapping(value = "/add_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_show(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_attribute_value> mmall_attribute_valueList = mmall_attribute_valueService.list();
        model.addAttribute("Mmall_attribute_valueList",mmall_attribute_valueList);
        String str = mapper.writeValueAsString(model);
        return str;
    }


    @RequestMapping(value = "/add_submit" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_submit(Mmall_attribute_value mmall_attribute_value) throws JsonProcessingException{
        /*mmall_attribute_value = new Mmall_attribute_value();
        mmall_attribute_value.setAttribute_id(1);
        mmall_attribute_value.setAttribute_value("16G");
        mmall_attribute_value.setId(9);
        mmall_attribute_value.setValue_sort(3);*/
        mmall_attribute_valueService.insert(mmall_attribute_value);
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_attribute_value> mmall_attribute_valueList = mmall_attribute_valueService.list();
        String str = mapper.writeValueAsString(mmall_attribute_valueList);
        return str;
    }

    @RequestMapping(value = "/update_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_show(Integer id,Model model)throws JsonProcessingException{
        Mmall_attribute_value mmall_attribute_value = mmall_attribute_valueService.find(id);
        model.addAttribute("Mmall_attribute_value",mmall_attribute_value);
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(model);
        return str;
    }

    @RequestMapping(value = "/update_submit",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_submit(Mmall_attribute_value mmall_attribute_value)throws JsonProcessingException{
        mmall_attribute_valueService.update(mmall_attribute_value);
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_attribute_value> mmall_attribute_valueList = mmall_attribute_valueService.list();
        String str =mapper.writeValueAsString(mmall_attribute_valueList);
        return str;
    }
    @RequestMapping(value = "/findkey",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findkey(Integer attribute_id) throws JsonProcessingException{
        List<Mmall_attribute_value>keylist = mmall_attribute_valueService.keylist(attribute_id);
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(keylist);
        return str;
    }
}
