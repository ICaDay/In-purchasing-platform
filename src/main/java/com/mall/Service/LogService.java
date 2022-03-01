package com.mall.Service;/*
    @author Administrator
    @create 2021-09-15 18:35
*/

import com.mall.entity.log;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LogService {
    boolean add_log(log Log);
    boolean delete_log(String log_id);
    List<log>findAll();
    List<log>findStatus(String content);

}
