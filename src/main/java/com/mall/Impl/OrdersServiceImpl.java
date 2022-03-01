package com.mall.Impl;

import com.mall.mapper.OrdersMapper;
import com.mall.Service.IOrdersService;
import com.mall.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 
@create 2021-07-25-15:23
*/
@Service
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> list(){
        return ordersMapper.findAll();
    }
    @Override
    public int insert(Orders orders){
        return ordersMapper.doAdd(orders);
    }
    @Override
    public List<Orders> find(Integer ordersId){
        return ordersMapper.find(ordersId);
    }
    @Override
    public int update(Orders orders){
        return ordersMapper.doUpdate(orders);
    }
    @Override
    public List<Orders> findStatus(String ordersStatus,Integer member_id){return ordersMapper.findStatus(ordersStatus,member_id);}
    @Override
    public List<Orders> findId(Integer member_id){
        return ordersMapper.findId(member_id);
    }
    @Override
    public  List<Orders> findorders(String ordersStatus){
        return ordersMapper.findorders(ordersStatus);
    }
}
