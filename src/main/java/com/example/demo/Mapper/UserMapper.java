package com.example.demo.Mapper;

import com.example.demo.Entity.Task;
import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM hust_plan.user_info where User_name=#{User_name}")
    User findUserByName(String User_name);

    @Select("SELECT * FROM hust_plan.user_info where User_name=#{User_name}")
    User getPwdByUserName(@Param("User_name") String User_name,@Param("User_pwd") String User_pwd);

    @Select("SELECT * FROM hust_plan.user_info")
    List<User> getAllUser();

    @Insert("INSERT INTO user_info (User_name,User_pwd,User_sex,User_email,User_tagSchool,User_slogan,Tasks_ID) values(#{User_name},#{User_pwd},#{User_sex},#{User_email},#{User_tagSchool},#{User_slogan},'1,')")
    Integer register(User user);


    @Select("select User_name from user_info")
    List<String> getAllName();

    /*@Select("select User_name,time from user_info"){
        Map<String,Integer> getAll();
    }*/


    @Select("select * from hust_plan.testforrank order by User_learningTime DESC")
    List<User> rankMyFriend();

    @Update("update user_info set Tasks_ID=#{Tasks_ID} where User_name=#{User_name}")
    Integer updateUserTasksID(@Param("Tasks_ID") String Tasks_ID,@Param("User_name") String User_name);


    @Update("update task_info set Task_leftTime=#{leftTime} where Task_ID=#{taskId}")
    Integer updateLeftTime(@Param("taskId") String taskId,@Param("leftTime") String leftTime);


}
