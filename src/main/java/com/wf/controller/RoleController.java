package com.wf.controller;

import com.wf.pojo.Role;
import com.wf.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
private RoleService roleService;
    @RequestMapping("list")
    public ModelAndView findAllRole(){
        ModelAndView ModelAndView = new ModelAndView();
        //获取数据
        List<Role> roleList = roleService.findAllRole();
        //把数据带到页面上
        ModelAndView.addObject("roleList", roleList);
        ModelAndView.setViewName("role-list");
        return ModelAndView;
    }
}
