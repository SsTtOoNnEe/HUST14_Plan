package com.example.demo.Mapper;

import com.example.demo.Entity.Manager;
import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ManagerMapper {

    @Select("select * from manager_info")
    List<Manager> findAllManagers();

    @Select("SELECT * FROM hust_plan.manager_info where Manager_name=#{Manager_name}")
    Manager getPwdByManagerName(@Param("Manager_name") String Manager_name, @Param("Manager_pwd") String Manager_pwd);
}
