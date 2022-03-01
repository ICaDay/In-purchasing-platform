package com.mall.Controller;

/*
@author 
@create 2021-08-30-14:35
*/

import com.mall.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController

public class EmailController {
    @Autowired
    EmailService emailService;
    @RequestMapping("/send01")
    public String sendSimpleEmail(String to, HttpServletRequest request){
        //to = "1091603870@qq.com" ;
        String subject = "验证码";
        //Integer number = 1111;
        Integer number = (int)((Math.random()*9+1)*1000) ;
        request.getSession().setAttribute("code",number.toString());
        request.getSession().setAttribute("email",to);
        String text = "您的验证码是 "+ Integer.toString(number) +"  请在五分钟内完成验证";
        emailService.sendSimpleEmail(to,subject,text);
        return "发送成功";
    }

    @RequestMapping("/yanzheng")
    public String yanzheng(String email,String code,HttpServletRequest request) {
        //email = "1091603870@qq.com";
        //code = "1111";
        String emailAddress = (String) request.getSession().getAttribute("email");
        String codeId = (String) request.getSession().getAttribute("code");
        if(email.equals(emailAddress)&&code.equals(codeId)){
            return "1";
        }
        else{
            return "0";
        }
    }
}
