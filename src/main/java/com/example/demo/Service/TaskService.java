package com.example.demo.Service;

import com.example.demo.Entity.Task;

import java.util.List;

public interface TaskService {
    Task findTaskByID(Integer Task_ID);

    Integer findTaskIdByName(String Task_name);

    Integer addTask(Task task);


    void deleteTaskByName(String Task_name);


    Integer findUserIdByTaskId(String Task_ID);

    Integer editPlanByID(Task task);

}
