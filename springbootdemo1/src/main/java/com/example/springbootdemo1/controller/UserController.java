package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.pojo.User;
import com.example.springbootdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired(required = false)
    UserService userService;

    //@RequestMapping
    @GetMapping("user") @ResponseBody
    public List<User> user(){
        return userService.getUserList();
    }

    @GetMapping("index")
    public String index(HttpServletRequest request){
        request.setAttribute("user",userService.getUserList());
        return "index";
    }
}
