package com.example.demo.Mapper;

import com.example.demo.Entity.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Select("select * from task_info where Task_ID=${Task_ID}")
    Task findTaskByID(Integer Task_ID);

}
