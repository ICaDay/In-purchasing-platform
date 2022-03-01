package com.mall.Controller;

/*
@author 
@create 2021-08-29-13:41
*/


import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import com.mall.entity.Sms;
import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/sms")
public class SmsController {
    @RequestMapping(value = "/smsCode",method = RequestMethod.POST)
    public void sms(@RequestBody Sms sms){
        int appid = 1400565244 ;
        String appkey = "" ;
        int templateId = 1 ;
        String smsSign = " ";
        try{
            String[] params = {sms.getCode(),Integer.toString((sms.getMin()))};
            SmsSingleSender ssender = new SmsSingleSender(appid,appkey);
            SmsSingleSenderResult result = ssender.sendWithParam("86",sms.getPhoneNumber(),templateId,params,smsSign,"","");
            System.out.println(result);
        }catch(HTTPException e){
            e.printStackTrace();
        }catch(JSONException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
