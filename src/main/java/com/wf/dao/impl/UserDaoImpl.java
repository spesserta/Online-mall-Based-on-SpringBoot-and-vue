package com.wf.dao.impl;
import com.wf.dao.UserDao;
import com.wf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<User> findAllUser() {
        //把查询出来的数据封装到集合里
        List<User> userList = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
        return userList;
    }

//    public List<Role> findRoleByUserId(Long id) {
//        List<Role> roles = jdbcTemplate.query("select * from user_role ur,role r where ur.roleId=r.id and ur.userId=?", new BeanPropertyRowMapper<Role>(Role.class), id);
//        return roles;
//    }
}