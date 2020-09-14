package com.example.demo.Mapper;

import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM hust_plan.user_info where User_ID=${User_ID}")
    User findUserByID(Integer User_ID);

<<<<<<< HEAD
    @Select("Select * from hust_plan.user_info where User_name=${User_name")
    User findUserByName(String User_name);
=======
    @Insert("INSERT INTO user_info (User_name,User_pwd,User_sex,User_eamil,User_tagSchool,User_slogan,Tasks_ID) values(#{User_name},#{User_pwd},#{User_sex},#{User_email},#{User_tagSchool},#{User_slogan},#{Tasks_ID}")
    Integer register(User user);

>>>>>>> b9a48136c9d17921ac2093ba548dc8666651fee8
}
