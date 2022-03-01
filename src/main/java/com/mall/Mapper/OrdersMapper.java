package com.mall.mapper;

import com.mall.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
@author 
@create 2021-07-25-15:19
*/
@Mapper
public interface OrdersMapper {
    List<Orders>findAll();
    List<Orders> find(Integer ordersId);
    int doAdd(Orders orders);
    int doUpdate(Orders orders);
    List<Orders>findStatus(String ordersStatus,Integer member_id);
    List<Orders>findId(Integer member_id);
    List<Orders> findorders(String ordersStatus);
}
