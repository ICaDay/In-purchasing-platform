package com.mall.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.Service.IOrdersService;
import com.mall.Service.IStoresService;
import com.mall.entity.Orders;
import com.mall.entity.Stores;
import org.springframework.beans.factory.annotation.Autowired;
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

@RequestMapping("/admin/stores")
@Controller


public class AdminStoresController {
    @Resource
    private IStoresService storesService;
    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String list(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Stores> storesList = storesService.list();
        model.addAttribute("storesList",storesList);
        String str = mapper.writeValueAsString(model);
        return str;
    }
    @RequestMapping(value = "/add_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_show(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Stores> storesList = storesService.list();
        model.addAttribute("StoresList",storesList);
        String str = mapper.writeValueAsString(model);
        return str;
    }


    @RequestMapping(value = "/add_submit" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_submit(Stores stores) throws JsonProcessingException{
        storesService.insert(stores);
        ObjectMapper mapper = new ObjectMapper();
        List<Stores> storesList = storesService.list();
        String str = mapper.writeValueAsString(storesList);
        return str;
    }

    @RequestMapping(value = "/update_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_show(Integer storesId,Model model)throws JsonProcessingException{
        Stores stores = storesService.find(storesId);
        model.addAttribute("stores",stores);
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(model);
        return str;
    }

    @RequestMapping(value = "/update_submit",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_submit(Stores stores)throws JsonProcessingException{
        storesService.update(stores);
        ObjectMapper mapper = new ObjectMapper();
        List<Stores> storesList = storesService.list();
        String str =mapper.writeValueAsString(storesList);
        return str;
    }
}
