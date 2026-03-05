package com.wf.dao;
import com.wf.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    public List<User> findAllUser();
}
