package com.example.demo.Mapper;
import com.example.demo.Entity.Manager;
import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ManagerMapper {

    @Select("select * from manager_info")
    List<Manager> findAllManagers();


    @Select("SELECT * FROM hust_plan.manager_info where Manager_name=#{Manager_name}")
    Manager getPwdByManagerName(@Param("Manager_name") String Manager_name, @Param("Manager_pwd") String Manager_pwd);

    @Insert("insert into manager_info (Manager_name,Manager_pwd,Manager_sex,Manager_bir,Manager_phone,Manager_email,Manager_key) values(#{Manager_name},#{Manager_pwd},#{Manager_sex},#{Manager_bir},#{Manager_phone},#{Manager_email},#{Manager_key})")
    Integer ad_register(Manager manager);

    @Delete("delete from user_info where User_name=#{User_name}")
    Integer delete_user(String User_name);

}
