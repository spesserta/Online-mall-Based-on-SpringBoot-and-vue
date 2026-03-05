package com.wf.dao.impl;
import com.wf.dao.RoleDao;
import com.wf.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class RoleDaoImpl implements RoleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Role> findAllRole() {
        //把查询出来的数据封装到集合里
        List<Role> listRole = jdbcTemplate.query("select * from role", new BeanPropertyRowMapper<Role>(Role.class));
        return listRole;
    }
}