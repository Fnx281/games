package com.dhx.service.impl;

import com.dhx.dao.UserDao;
import com.dhx.dao.impl.UserDaoImpl;
import com.dhx.domain.User;
import com.dhx.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao ud = new UserDaoImpl();

    //注册用户
    @Override
    public boolean register(User user) {
        User username = ud.findUsername(user.getUsername());
        if (username!=null){
            return false;
        }
        ud.saveRegisterUser(user);
        return true;
    }

    //用户登录
    @Override
    public User login(String username,String password) {
        return ud.login(username, password);
    }
}
