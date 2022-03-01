package com.mall.Impl;

/*
@author 
@create 2021-08-16-18:02
*/


import com.mall.mapper.RecommendMapper;
import com.mall.Service.IRecommendService;
import com.mall.entity.Recommend;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class RecommendServiceImpl implements IRecommendService {
    @Resource
    private RecommendMapper recommendMapper;
    @Override
    public List<Recommend> list(){ return recommendMapper.findAll();};
    @Override
    public Recommend find(Integer Id){ return recommendMapper.find(Id);}
    @Override
    public int insert(Recommend recommend){ return recommendMapper.doAdd(recommend);}
    @Override
    public int update(Recommend recommend){ return recommendMapper.doUpdate(recommend);}
    @Override
    public List<Recommend> finduser(Integer userId){ return recommendMapper.finduser(userId);}
}
