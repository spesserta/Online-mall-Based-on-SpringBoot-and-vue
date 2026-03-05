package com.wf.service.impl;
import com.wf.dao.RoleDao;
import com.wf.dao.UserDao;
import com.wf.pojo.User;
import com.wf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    public List<User> findAllUser() {
        List<User> userList = userDao.findAllUser();
        //封装Userlist
//        for (User user : userList) {
//            //获得User的id
//            Long id=user.getId();
//            //将id作为参数，作为当前UserId对应Role表集合数据
////            List<Role> roles= roleDao.findRoleByUserId(id);
//            List<Role> roles=roleDao.findRoleByUserId(id);
//            //得到数据，对User进行封装
//            user.setRoles(roles);
//        }
        return userList;
    }
}
