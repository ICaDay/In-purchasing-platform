package com.mall.Impl;/*
    @author Administrator
    @create 2021-09-15 18:39
*/

import com.mall.mapper.LogMapper;
import com.mall.Service.LogService;
import com.mall.entity.log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;
    @Override
    public boolean add_log(log Log){
        if(Log !=null){
            Log.setStatus(0);
            int add=logMapper.add_log(Log);
            if(add==1){
                return true;
            }
        }
        return false;

    }
    @Override
    public List<log>findAll(){
        return logMapper.findAll();
    }
    @Override
    public boolean delete_log(String log_id){
        if(log_id != null){
            int dd=logMapper.delete_log(log_id);
            if(dd==1){
                return true;
            }
        }
        return false;
    }
    @Override
    public List<log>findStatus(String content){
        return logMapper.findStatus(content);
    }
}
