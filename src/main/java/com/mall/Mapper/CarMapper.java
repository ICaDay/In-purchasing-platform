package com.mall.mapper;

import com.mall.entity.Car;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
@author 
@create 2021-08-02-15:34
*/
@Mapper
public interface CarMapper {
    List<Car> findAll();
    Car find(Integer carId);
    int doAdd(Car car);
    int doUpdate(Car car);
    List<Car>findgoodsList(Integer userId);
}
