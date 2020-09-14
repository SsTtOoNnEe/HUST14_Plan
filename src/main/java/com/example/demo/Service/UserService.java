package com.example.demo.Service;

import com.example.demo.Entity.User;

import java.util.List;

public interface UserService {

    User findUserByID(Integer User_ID);

    User getPwdByUserName(String User_name,String User_pwd);

    Integer register(User user);


}
