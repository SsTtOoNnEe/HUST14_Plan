package com.example.demo.Mapper;

import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM hust_plan.user_info where User_ID=${User_ID}")
    User findUserByID(Integer User_ID);

    @Insert("INSERT INTO user_info (User_name,User_pwd,User_sex,User_phone,User_email,User_tagSchool,User_slogan,Tasks_ID) values(#{User_name},#{User_pwd},#{User_sex},#{User_phone},#{User_email},#{User_tagSchool},#{User_slogan},#{Tasks_ID})\n")
    Integer register(User user);

    @Select("select User_name from user_info")
    List<String> getAllName();

    /*@Select("select User_name,time from user_info"){
        Map<String,Integer> getAll();
    }*/

}
