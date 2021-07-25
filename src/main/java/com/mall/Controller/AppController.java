package com.mall.Controller;/*
    @author Administrator
    @create 2021-07-13 9:09
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
    @RequestMapping("/")//处理请求，/为默认8080端口= =
    @ResponseBody
    public String index(){ return "welcome my project";
    }
}
