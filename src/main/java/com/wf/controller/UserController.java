package com.wf.controller;
import com.wf.pojo.User;
import com.wf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    public ModelAndView findAllUser(){
        ModelAndView ModelAndView = new ModelAndView();
        //获取数据
        List<User> userList = userService.findAllUser();
        //把数据带到页面上
        ModelAndView.addObject("userList", userList);
        ModelAndView.setViewName("user-list");
        return ModelAndView;
    }
}
