package com.mall.Controller;/*
    @author Administrator
    @create 2021-08-23 22:47
*/

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.mall.Service.InvoiceService;
import com.mall.entity.ResultMap;
import com.mall.entity.invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Invoice")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;
    ResultMap resultMap=new ResultMap();
    @RequestMapping("/add_invoice")
    @ResponseBody
    public String add_invoice(invoice Invoice){
        boolean add_invoice=invoiceService.addInvoice(Invoice);
        resultMap.setStatus(add_invoice);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("delete_invoice")
    @ResponseBody
    public String delete_invoice(String invoice_id){
        boolean delete=invoiceService.deleteInvoice(invoice_id);
        resultMap.setStatus(delete);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/find_Invoice")
    @ResponseBody
    public String find_Invoice(Integer page,Integer limit){
        PageInfo<invoice> invoicePageInfo=invoiceService.Invoice_List(page,limit);
        resultMap.setList(invoicePageInfo.getList());
        resultMap.setCount((int)invoicePageInfo.getTotal());
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping("/update_invoice")
    @ResponseBody
    public String update_invoice(invoice invoice){
        boolean update = invoiceService.updateInvoice(invoice);
        resultMap.setStatus(update);
        return JSON.toJSONString(resultMap);
    }
    @RequestMapping(value = "/findStatus",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findStatus(String cstatus, Model model) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        List<invoice> invoiceList = invoiceService.findStatus(cstatus);
        model.addAttribute("invoiceList",invoiceList);
        String str=mapper.writeValueAsString(model);
        return str;
    }
}
