package com.mall.mapper;/*
    @author Administrator
    @create 2021-09-15 18:07
*/

import com.mall.entity.log;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LogMapper {
    List<log>findAll();
    List<log>findStatus(String content);
    Integer add_log(log Log);
    Integer delete_log(String log_id);
//    Integer update_log(log Log);
}
