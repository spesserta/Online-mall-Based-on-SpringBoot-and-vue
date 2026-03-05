package com.wf.dao;

import com.wf.pojo.Goods;

import java.util.List;


public interface GoodsDao {
    //查询所有的商品信息
    public List<Goods> findAllGoods();
    //添加
    public void addGoods(Goods goods);
    //根据商品名称进行查询
    public List<Goods> findGoodsByName(String name);
    //删除
   // public void deleteGoods(Goods goods);

    void deleteGoods(Integer goodsId);
}
