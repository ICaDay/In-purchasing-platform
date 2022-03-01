package com.mall.Service;/*
    @author Administrator
    @create 2021-10-04 13:45
*/

import com.mall.entity.Adress;

import java.util.List;

public interface AdressService {
    List<Adress> findId(String member_id);
    boolean address(Adress adress);
    boolean deleteaddress(String Adress_id);
    boolean updateaddress(Adress adress);
    List<Adress> findAll();
}
