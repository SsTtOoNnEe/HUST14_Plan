package com.example.demo.Mapper;

import com.example.demo.Entity.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Select("select * from task_info where Task_ID=${Task_ID}")
    Task findTaskByID(Integer Task_ID);

    @Select("select Task_ID from task_info where Task_name=#{Task_name}")
    Integer findTaskIdByName(String Task_name);

    @Insert("insert into task_info(Task_name,Task_type,Task_time,Task_severity,Task_leftTime) values(#{Task_name},#{Task_type},#{Task_time},#{Task_severity},#{Task_time})")
    Integer addTask(Task task);

    @Delete("delete from task_info where Task_name=#{Task_name}")
    void deleteTaskByName(String Task_name);

    @Select("select User_ID from task_info where Task_ID=#{Task_ID}")
    Integer findUserIdByTaskId(String Task_ID);

    @Update("update task_info set Task_name=#{Task_name},Task_time=#{Task_time} where Task_ID=${Task_ID}")
    Integer editPlanByID(Task task);
}
