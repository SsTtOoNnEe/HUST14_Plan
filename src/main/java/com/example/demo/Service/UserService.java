package com.example.demo.Service;

import com.example.demo.Entity.User;

import java.util.List;

public interface UserService {

    User findUserByID(Integer User_ID);

    String findUserPWD(String User_Name);

}
