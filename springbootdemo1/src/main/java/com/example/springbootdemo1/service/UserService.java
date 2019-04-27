package com.example.springbootdemo1.service;

import com.example.springbootdemo1.pojo.User;
import java.util.List;

public interface UserService {

    //得到User表的集合
    List<User> getUserList();
}
