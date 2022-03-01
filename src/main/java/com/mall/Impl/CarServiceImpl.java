package com.mall.Impl;

/*
@author 
@create 2021-08-02-15:34
*/


import com.mall.mapper.CarMapper;
import com.mall.Service.ICarService;
import com.mall.entity.Car;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService {
    @Autowired
    private CarMapper carMapper;
    @Override
    public List<Car> list(){return carMapper.findAll();}
    @Override
    public int insert(Car car){return carMapper.doAdd(car);}
    @Override
    public Car find(Integer carId){return carMapper.find(carId);}
    @Override
    public int update(Car car){return carMapper.doUpdate(car);}
    @Override
    public List<Car> findgoodsList(Integer userId){return carMapper.findgoodsList(userId);}
}
