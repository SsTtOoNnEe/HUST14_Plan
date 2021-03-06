package com.example.demo.ServiceImpl;

import com.example.demo.Entity.Task;
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
    public User findUserByName(String User_name) {
        return userMapper.findUserByName(User_name);
    }

    @Override
    public User getPwdByUserName(String User_name, String User_pwd) {
        return userMapper.getPwdByUserName(User_name,User_pwd);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public Integer register(User user) {
        return userMapper.register(user);
    }

    @Override

    public List<String> getAllName() {
        return userMapper.getAllName();
    }


    public List<User> rankMyFriend(Integer user_id) {
        List<User> list = userMapper.rankMyFriend(user_id);
        return list;
    }

    @Override
    public Integer updateUserByName(User user) {
        return userMapper.updateUserByName(user);
    }

    @Override
    public Integer updateUserTasksID(String Tasks_ID, String User_name) {
        return userMapper.updateUserTasksID(Tasks_ID,User_name);
    }

    @Override
    public Integer updateLeftTime(Integer taskId,String leftTime) {
        return userMapper.updateLeftTime(taskId,leftTime);
    }

    @Override
    public Integer addFrind(Integer User_ID, Integer Friend_ID) {
        return userMapper.addFrind(User_ID,Friend_ID);
    }

    @Override
    public Integer getIDbyUserName(String User_name) {
        return userMapper.getIDbyUserName(User_name);
    }

    @Override
    public User getUserByUserID(int User_ID) {
        return userMapper.getUserByUserID(User_ID);
    }

    @Override
    public Integer updateDiaryID(String User_name, String Diaries_ID) {
        return userMapper.updateDiaryID(User_name,Diaries_ID);
    }


}
