package com.wf.service;

import com.wf.pojo.Goods;

import java.util.List;

public interface GoodsService {
    //查询
    public List<Goods> findAllGoods();
    //增加
    public void addGoods(Goods goods);
    //查找
    public List<Goods> findGoodsByName(String goodsName);
    //删除
    public void deleteGoods(Integer goodsId);
}
