package com.example.demo.Mapper;

import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("selete * from user_info")
    List<User> findAllUser();
}
