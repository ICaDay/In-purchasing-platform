package com.mall.Impl;/*
    @author Administrator
    @create 2021-08-23 22:37
*/

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.mapper.InvoiceMapper;
import com.mall.Service.InvoiceService;
import com.mall.entity.invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    InvoiceMapper invoiceMapper;
    @Override
    public boolean addInvoice(invoice Invoice) {
        if(Invoice!=null){
            Invoice.setStatus(0);
            int add=invoiceMapper.addInvoice(Invoice);
            if(add==1){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteInvoice(String invoice_id) {
        if(invoice_id!=null){
            int delete=invoiceMapper.deleteInvoice(Integer.parseInt(invoice_id));
            if(delete==1){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean updateInvoice(invoice invoice) {
        if(invoice!=null){
            int update=invoiceMapper.updateInvoice(invoice);
            if(update==1){
                return true;
            }
        }
        return false;
    }
    @Override
    public PageInfo<invoice> Invoice_List(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<invoice> invoices=invoiceMapper.findAll();
        PageInfo<invoice> invoicePageInfo=new PageInfo<>(invoices);
        return invoicePageInfo;
    }
    @Override
    public List<invoice>findStatus(String cstatus){
        return invoiceMapper.findStatus(cstatus);
    }
}
