package com.example.demo.Mapper;

import com.example.demo.Entity.Task;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Select("select * from task_info where Task_ID=${Task_ID}")
    Task findTaskByID(Integer Task_ID);

    @Select("select Task_ID from task_info where Task_name=#{Task_name}")
    Integer findTaskIdByName(String Task_name);

    @Insert("insert into task_info(Task_name,Task_type,Task_time,Task_severity) values(#{Task_name},#{Task_type},#{Task_time},#{Task_severity})")
    Integer addTask(Task task);

    @Select("select User_ID from task_info where Task_ID=#{Task_ID}")
    Integer findUserIdByTaskId(String Task_ID);

    @Delete("delete from task_info where Task_ID=#{Task_ID}")
    void delTask(String Task_ID);

}
