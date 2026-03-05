package com.wf.controller;
import com.wf.pojo.Goods;
import com.wf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/list")
    public ModelAndView FindAllGoods(){
        ModelAndView modelAndView = new ModelAndView();
        //获取数据
        List<Goods> goodsList=goodsService.findAllGoods();
        //把数据封装在modelAndView对象里
        modelAndView.addObject("goodsList",goodsList);
        modelAndView.setViewName("user-list");
        return modelAndView;
    }
    @RequestMapping("/save")
    public String addGoods(Goods goods){
        goodsService.addGoods(goods);
        return "redirect:/goods/list";
    }

    @RequestMapping("/findName")
    public ModelAndView findGoodsByName(String name){
        ModelAndView modelAndView = new ModelAndView();
        List<Goods> goodsList=goodsService.findGoodsByName(name);
        modelAndView.addObject("goodsList",goodsList);
        modelAndView.setViewName("user-list");

        return modelAndView;
    }

    @RequestMapping("/delGoods/{goodsId}")
    public String deleteGoodsById(@PathVariable("goodsId") int goodsId){
        System.out.println(goodsId);
        goodsService.deleteGoods(goodsId);
        return "redirect:/goods/list";
    }
}