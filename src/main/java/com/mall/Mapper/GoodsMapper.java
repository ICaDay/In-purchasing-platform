package com.mall.mapper;

import com.mall.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
@author 
@create 2021-07-19-12:58
*/

@Mapper
public interface GoodsMapper {
    List<Goods>findAll();
    Goods find(Integer goodsId);
    int doAdd(Goods goods);
    Integer doUpdate(Goods goods);
    List<Goods>findstoresgoods(Integer storesId);
    List<Goods>findType(String goodsType);
    List<Goods>findStatus(String goodsStatus);
    List<Goods>findcategorygoods(String categoryId);
    List<Goods>search(String keyword);
    List<Goods>findgoodsId(Integer goodsId);
    Integer get_Id();

}
