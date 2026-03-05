package com.wf.service.impl;

import com.wf.dao.GoodsDao;
import com.wf.pojo.Goods;
import com.wf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
@Autowired
private GoodsDao goodsDao;
    @Override
    public List<Goods> findAllGoods() {
        return goodsDao.findAllGoods();
    }

    @Override
    public void addGoods(Goods goods) {
        goodsDao.addGoods(goods);
    }

    @Override
    public List<Goods> findGoodsByName(String goodsName) {
        return goodsDao.findGoodsByName(goodsName);
    }


    @Override
    public void deleteGoods(Integer goodsId) {
        goodsDao.deleteGoods(goodsId);
    }
}