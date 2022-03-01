package com.mall.Impl;/*
    @author Administrator
    @create 2021-10-04 13:49
*/

import com.alibaba.fastjson.JSON;
import com.mall.Service.AdressService;
import com.mall.entity.Adress;
import com.mall.mapper.AdressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressServiceImpl implements AdressService {
    @Autowired
    AdressMapper adressMapper;
    @Override
    public List<Adress> findId(String member_id){
        return adressMapper.findId(member_id);
    }
    @Override
    public boolean address(Adress adress){
        if(adress!=null){
            adress.setStatus(0);
            int add=adressMapper.address(adress);
            if(add==1){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean deleteaddress(String Adress_id){
        if(Adress_id!=null){
            int add=adressMapper.deleteaddress(Integer.parseInt(Adress_id));
            if(add==1){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean updateaddress (Adress adress){
        if(adress!=null){
            int upd=adressMapper.updateaddress(adress);
            if(upd==1){
                return true;
            }
        }
        return false;
    }
    @Override
    public List<Adress> findAll(){
        return adressMapper.findAll();
    }
}
