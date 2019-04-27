package com.example.springbootdemo1.service;

import com.example.springbootdemo1.dao.UserMapper;
import com.example.springbootdemo1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserMapper userMapperl;

    @Override
    public List<User> getUserList() {
        return userMapperl.selectUserAll();
    }
}
