package com.dhx.service;

import com.dhx.domain.Article;
import com.dhx.domain.User;

public interface UserService {
    /**
     * 注册用户
     * @param user
     * @return
     */
    public abstract boolean register(User user);

    /**
     * 用户登录
     * @param user
     * @return
     */
    public abstract User login(String username,String password);
}
