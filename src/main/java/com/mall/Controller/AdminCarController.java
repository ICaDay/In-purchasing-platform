package com.mall.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.Service.ICarService;
import com.mall.Service.IGoodsService;
import com.mall.Service.IStoresService;
import com.mall.entity.Car;
import com.mall.entity.Goods;
import com.mall.entity.Stores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/*
@author 
@create 2021-07-25-15:26
*/

@RequestMapping("/admin/car")
@Controller


public class AdminCarController {
    @Resource
    private ICarService carService;
    @Resource
    private IGoodsService goodsService;
    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String list(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Car> carList = carService.list();
        model.addAttribute("carList",carList);
        String str = mapper.writeValueAsString(model);
        return str;
    }
    @RequestMapping(value = "/add_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_show(Model model) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        List<Car> carList = carService.list();
        model.addAttribute("CarList",carList);
        String str = mapper.writeValueAsString(model);
        return str;
    }


    @RequestMapping(value = "/add_submit" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_submit(Car car) throws JsonProcessingException{
        carService.insert(car);
        ObjectMapper mapper = new ObjectMapper();
        List<Car>carList = carService.list();
        String str = mapper.writeValueAsString(carList);
        return str;
    }

    @RequestMapping(value = "/update_show",produces = "application/json;charset=utf-8",params = {"carId"})
    @ResponseBody
    public String update_show(Integer carId,Model model)throws JsonProcessingException{
        Car car = carService.find(carId);
        model.addAttribute("car",car);
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(model);
        return str;
    }
    @RequestMapping(value = "/update_submit",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_submit(Car car)throws JsonProcessingException{
        carService.update(car);
        ObjectMapper mapper = new ObjectMapper();
        List<Car> storesList = carService.list();
        String str =mapper.writeValueAsString(storesList);
        return str;
    }
    @RequestMapping(value="/userlist",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String cargoodslist(Integer member_id)throws JsonProcessingException{
        List<Car>goodsList=carService.findgoodsList(member_id);
        ObjectMapper mapper = new ObjectMapper();
        String str =mapper.writeValueAsString(goodsList);
        return str;
    }
}
