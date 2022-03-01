package com.mall.Service;

import com.mall.entity.Category;
import com.mall.entity.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 
@create 2021-07-25-15:27
*/

public interface IOrdersService {
    List<Orders> list();
    List<Orders> find(Integer ordersId);
    int insert(Orders orders);
    int update(Orders orders);
    List<Orders>findStatus(String ordersStatus,Integer member_id);
    List<Orders> findId(Integer member_id);
    List<Orders> findorders(String ordersStatus);
}
