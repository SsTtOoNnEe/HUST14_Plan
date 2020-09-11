package com.example.demo.Mapper;

import com.example.demo.Entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ManagerMapper {

    @Select("select * from manager_info")
    List<Manager> findAllManagers();
}
