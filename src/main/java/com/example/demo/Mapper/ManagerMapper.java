package com.example.demo.Mapper;

import com.example.demo.Entity.Manager;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ManagerMapper {

    @Select("select * from manager_info")
    List<Manager> findAllManagers();

    @Insert("insert into manager_info (Manager_name,Manager_pwd,Manager_sex,Manager_bir,Manager_phone,Manager_email,Manager_key) values(#{Manager_name},#{Manager_pwd},#{Manager_sex},#{Manager_bir},#{Manager_phone},#{Manager_email},#{Manager_key})")
    Integer ad_register(Manager manager);
}
