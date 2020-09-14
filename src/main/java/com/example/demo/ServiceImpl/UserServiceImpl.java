package com.example.demo.ServiceImpl;

import com.example.demo.Entity.User;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserByID(Integer User_ID) {
        return userMapper.findUserByID(User_ID);
    }

    @Override
    public User getPwdByUserName(String User_name, String User_pwd) {
        return userMapper.getPwdByUserName(User_name,User_pwd);
    }

    @Override
    public Integer register(User user) {
        return userMapper.register(user);
    }


}
