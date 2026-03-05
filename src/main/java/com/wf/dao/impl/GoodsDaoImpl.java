package com.wf.dao.impl;

import com.wf.dao.GoodsDao;
import com.wf.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class GoodsDaoImpl implements GoodsDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Goods> findAllGoods() {
        List<Goods> goodsList = jdbcTemplate.query("select * from goods", new BeanPropertyRowMapper<Goods>(Goods.class));
        return goodsList;
    }

    @Override
    public void addGoods(Goods goods) {
        jdbcTemplate.update("insert into goods values(?,?,?,?,?)",null,goods.getName(),goods.getNumber(),goods.getPrice(),goods.getInventory());
    }

    @Override
    public List<Goods> findGoodsByName(String name) {
        //jdbcTemplate.query("select * from goods where name like '%"+name+"%'", new RowMapper<Goods>(){});
        List<Goods> goodsList = jdbcTemplate.query("select * from goods where name like ?", new BeanPropertyRowMapper<Goods>(Goods.class), "%"+name+"%");
        return goodsList;
    }

    @Override
    public void deleteGoods(Integer goodsId) {
        jdbcTemplate.update("delete from goods where id=?",goodsId);
    }
}
