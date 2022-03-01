package com.mall.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.Service.IMmall_attribute_keyService;
import com.mall.Service.IMmall_attribute_valueService;
import com.mall.Service.IMmall_product_specsService;
import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Mmall_attribute_value;
import com.mall.entity.Mmall_product_specs;
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

@RequestMapping("/admin/mmall_product_specs")
@Controller


public class AdminMmall_product_specsController {
    @Resource
    private IMmall_product_specsService mmall_product_specsService;
    @Resource
    private IMmall_attribute_keyService mmall_attribute_keyService;
    @Resource
    private IMmall_attribute_valueService mmall_attribute_valueService;
    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String list(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_product_specs> mmall_product_specsList = mmall_product_specsService.list();
        model.addAttribute("mmall_product_specsList",mmall_product_specsList);
        String str = mapper.writeValueAsString(model);
        return str;
    }

    @RequestMapping(value = "/add_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_show(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_product_specs> mmall_product_specsList = mmall_product_specsService.list();
        model.addAttribute("Mmall_product_specsList",mmall_product_specsList);
        String str = mapper.writeValueAsString(model);
        return str;
    }

    @RequestMapping(value = "/add_submit" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_submit(Mmall_product_specs mmall_product_specs) throws JsonProcessingException{



        //System.out.println(s);

        ObjectMapper mapper = new ObjectMapper();

        mmall_product_specsService.insert(mmall_product_specs);
        List<Mmall_product_specs> mmall_product_specsList = mmall_product_specsService.list();
        String str = mapper.writeValueAsString(mmall_product_specsList);
        return str;
    }

    @RequestMapping(value = "/update_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_show(Integer id,Model model)throws JsonProcessingException{
        Mmall_product_specs mmall_product_specs = mmall_product_specsService.find(id);
        model.addAttribute("Mmall_product_specs",mmall_product_specs);
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(model);
        return str;
    }

    @RequestMapping(value = "/update_submit",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_submit(Mmall_product_specs mmall_product_specs)throws JsonProcessingException{
        mmall_product_specsService.update(mmall_product_specs);
        ObjectMapper mapper = new ObjectMapper();
        List<Mmall_product_specs> mmall_product_specsList = mmall_product_specsService.list();
        String str =mapper.writeValueAsString(mmall_product_specsList);
        return str;
    }
    @RequestMapping(value = "/findvalue",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findvalue(Integer goodsId,Model model)throws JsonProcessingException{
        //s="2G红色20cm";
        List<Mmall_product_specs> mmall_product_specs = mmall_product_specsService.findvalue(goodsId);
        model.addAttribute("Mmall_product_specs",mmall_product_specs);
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(model);
        return str;
    }
}
