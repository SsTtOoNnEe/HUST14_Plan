package com.example.demo.Mapper;


import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface UserMapper {

    @Select("SELECT * FROM hust_plan.user_info where User_name=#{User_name}")
    User findUserByName(String User_name);

    @Select("SELECT * FROM hust_plan.user_info where User_name=#{User_name}")
    User getPwdByUserName(@Param("User_name") String User_name,@Param("User_pwd") String User_pwd);


    @Insert("INSERT INTO user_info (User_name,User_pwd,User_sex,User_bir,User_phone,User_email,User_tagSchool,User_slogan,Tasks_ID) values(#{User_name},#{User_pwd},#{User_sex},#{User_bir},#{User_phone},#{User_email},#{User_tagSchool},#{User_slogan},'1,')")
    Integer register(User user);

    @Select("SELECT * FROM hust_plan.user_info")
    List<User> getAllUser();

    @Select("select User_name from user_info")
    List<String> getAllName();


    @Select("select * from hust_plan.user_info order by User_learningTime DESC")
    List<User> rankMyFriend();

    @Update("update user_info set Tasks_ID=#{Tasks_ID} where User_name=#{User_name}")
    Integer updateUserTasksID(@Param("Tasks_ID") String Tasks_ID,@Param("User_name") String User_name);

    @Update("update task_info set Task_leftTime=#{leftTime} where Task_ID=#{taskId}")
    Integer updateLeftTime(@Param("taskId") Integer taskId,@Param("leftTime") String leftTime);

    @Update("update user_info set User_pwd=#{User_pwd},User_sex=#{User_sex},User_bir=#{User_bir},User_phone=#{User_phone},User_email=#{User_email},User_tagSchool=#{User_tagSchool},User_slogan=#{User_slogan} where User_name=#{User_name};")
    Integer updateUserByName(User user);




    @Insert("INSERT INTO friend_info (User_ID,Friend_ID) VALUES (${User_ID},${Friend_ID})")
    Integer addFrind(@Param("User_ID") Integer User_ID,@Param("Friend_ID") Integer Friend_ID);

    @Select("SELECT User_ID FROM user_info WHERE User_name = #{User_name}")
    Integer getIDbyUserName(String User_name);

}
