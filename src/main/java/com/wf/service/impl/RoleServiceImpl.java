package com.wf.service.impl;

import com.wf.dao.RoleDao;
import com.wf.pojo.Role;
import com.wf.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    public List<Role> findAllRole() {
        return roleDao.findAllRole();
    }
}
