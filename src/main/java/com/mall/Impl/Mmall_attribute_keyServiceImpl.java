package com.mall.Impl;

import com.mall.mapper.Mmall_attribute_keyMapper;
import com.mall.mapper.StoresMapper;
import com.mall.Service.IMmall_attribute_keyService;
import com.mall.Service.IStoresService;
import com.mall.entity.Mmall_attribute_key;
import com.mall.entity.Stores;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
@author 
@create 2021-08-02-9:02
*/
@Service
public class Mmall_attribute_keyServiceImpl implements IMmall_attribute_keyService {
    @Resource
    private Mmall_attribute_keyMapper mmall_attribute_keyMapper;
    @Override
    public List<Mmall_attribute_key> list(){return mmall_attribute_keyMapper.findAll();}
    @Override
    public int insert(Mmall_attribute_key mmall_attribute_key){return mmall_attribute_keyMapper.doAdd(mmall_attribute_key);}
    @Override
    public Mmall_attribute_key find(Integer id){return mmall_attribute_keyMapper.find(id);}
    @Override
    public int update(Mmall_attribute_key mmall_attribute_key){return mmall_attribute_keyMapper.doUpdate(mmall_attribute_key);}
    @Override
    public List<Mmall_attribute_key> keylist(Integer categoryId){return mmall_attribute_keyMapper.keylist(categoryId);}
}
