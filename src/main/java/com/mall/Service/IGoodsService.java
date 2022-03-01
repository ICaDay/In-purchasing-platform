package com.mall.Service;

import com.mall.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/*
@author
@create 2021-07-19-13:19
*/

public interface IGoodsService {
    List<Goods>list();
    Goods find(Integer goods);
    int insert(Goods goods);
    boolean update(Goods goods);
    List<Goods>storesgoods(Integer storesId);
    List<Goods>findType(String goodsType);
    List<Goods> findStatus(String goodsStatus);
    List<Goods> findcategorygoods(String categoryId);
    List<Goods> search(String keyword);
    List<Goods>findgoodsId(Integer goodsId);
    Integer get_Id();
}
