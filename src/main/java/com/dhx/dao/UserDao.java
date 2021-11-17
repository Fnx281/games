package com.dhx.dao;

import com.dhx.domain.Article;
import com.dhx.domain.User;

public interface UserDao {
    /**
     * 查找用户名
     * @param username
     * @return
     */
    public abstract User findUsername(String username);

    /**
     * 保存user信息到user表
     * @param user
     * @return
     */
    public abstract int saveRegisterUser(User user);

    /**
     * 查询用户名和密码（用于登录等等）
     * @param username
     * @param password
     * @return
     */
    public abstract User login(String username,String password);

}
