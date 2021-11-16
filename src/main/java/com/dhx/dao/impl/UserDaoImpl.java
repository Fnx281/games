package com.dhx.dao.impl;

import com.dhx.Utils.JDBCUtils;
import com.dhx.dao.UserDao;
import com.dhx.domain.Article;
import com.dhx.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());

    //查找用户名
    @Override
    public User findUsername(String username) {
        User user = null;
        try {
            String sql = "select * from tab_user where username=?";
            user = jt.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username);
        } catch (Exception e) {

        }
        return user;
    }

    //保存用户到user表
    @Override
    public int saveRegisterUser(User user) {
        String sql = "insert into tab_user(username,password,birthday,gender,telePhone,email,status,code) values(?,?,?,?,?,?,?,?)";
        return jt.update(sql, user.getUsername(),
            user.getPassword(),
            user.getBirthday(),
            user.getGender(),
            user.getTelePhone(),
            user.getEmail(),
            user.getStatus(),
            user.getCode());
    }

    //查询用户名和密码（用于登录等）
    @Override
    public User login(String username, String password) {
        String sql = "select * from tab_user where username=? and password=?";
        return jt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username, password);
}

}
