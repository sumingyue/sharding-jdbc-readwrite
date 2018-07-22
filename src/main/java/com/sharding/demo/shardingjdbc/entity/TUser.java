package com.sharding.demo.shardingjdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class TUser implements Serializable {
    private Integer id;

    private String user_name;

    private String password;

    private String phone;

    private Integer sharding_id;

    private Date create_time;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSharding_id() {
        return sharding_id;
    }

    public void setSharding_id(Integer sharding_id) {
        this.sharding_id = sharding_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}