package com.mall.Controller;/*
    @author Administrator
    @create 2021-09-15 18:52
*/

import com.alibaba.fastjson.JSON;
import com.mall.Service.LogService;
import com.mall.entity.ResultMap;
import com.mall.entity.log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Log")
public class LogController {
    @Autowired
    LogService logService;
    ResultMap resultMap = new ResultMap();
    @RequestMapping("/add_log")
    @ResponseBody
    public String add_log(log Log){
        boolean add=logService.add_log(Log);
        resultMap.setStatus(add);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/delete_log")
    @ResponseBody
    public String delete_log(String log_id){
        boolean delete=logService.delete_log(log_id);
        resultMap.setStatus(delete);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/findStatus")
    @ResponseBody
    public String findStatus(String content){
        List<log> find=logService.findStatus(content);
        resultMap.setList(find);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        List<log> find=logService.findAll();
        resultMap.setList(find);
        return JSON.toJSONString(resultMap);
    }
}
