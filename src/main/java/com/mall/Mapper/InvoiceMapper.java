package com.mall.mapper;/*
    @author Administrator
    @create 2021-08-23 21:54
*/

import com.github.pagehelper.PageInfo;
import com.mall.entity.invoice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface InvoiceMapper {
    List<invoice> findAll();
    PageInfo<invoice> Invoice_List(int page,int limit);
    Integer addInvoice(invoice Invoice);
    Integer deleteInvoice(int invoice_id);
    List<invoice>findStatus(String cstatus);
    Integer updateInvoice(invoice invoice);
}
