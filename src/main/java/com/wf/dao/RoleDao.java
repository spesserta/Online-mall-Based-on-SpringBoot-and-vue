package com.wf.dao;

import com.wf.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleDao {
    public List<Role> findAllRole();
}
