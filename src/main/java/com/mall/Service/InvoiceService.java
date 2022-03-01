package com.mall.Service;/*
    @author Administrator
    @create 2021-08-23 22:30
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.Member;
import com.mall.entity.invoice;
import org.springframework.stereotype.Service;

import java.util.List;


public interface InvoiceService {
   boolean addInvoice(invoice Invoice);
   boolean deleteInvoice(String invoice_id);
   PageInfo<invoice> Invoice_List(Integer page,Integer limit);
   List<invoice> findStatus(String cstatus);
   boolean updateInvoice(invoice Invoice);
}
