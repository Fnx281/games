package com.dhx.domain;

import javax.xml.crypto.Data;
import java.util.Date;

public class User {
    private int id;          //用户id
    private String username; //用户名
    private String password; //用户密码
    private Date birthday;   //用户生日
    private String gender;   //用户性别
    private String telePhone;//用户手机号
    private String email;    //用户邮箱
    private String status;   //用户权限
    private String code;     //激活码（唯一）

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User(int id, String username, String password, Date birthday, String gender, String telePhone, String email, String status, String code) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.gender = gender;
        this.telePhone = telePhone;
        this.email = email;
        this.status = status;
        this.code = code;
    }


}
