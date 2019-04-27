package com.example.springbootdemo1.dao;

import com.example.springbootdemo1.pojo.User;

import java.util.List;

public interface UserMapper {

    //查询User表的所有数据
    List<User> selectUserAll();
}
