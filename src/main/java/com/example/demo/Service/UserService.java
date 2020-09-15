package com.example.demo.Service;

import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    User findUserByName(String User_name);

    User getPwdByUserName(String User_name,String User_pwd);

    Integer register(User user);


    List<String> getAllName();


    List<User> rankMyFriend();

    Integer updateUserByName(User user);


    Integer updateUserTasksID(String Tasks_ID,String User_name);


}
