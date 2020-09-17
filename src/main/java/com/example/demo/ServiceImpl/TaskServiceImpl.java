package com.example.demo.ServiceImpl;

import com.example.demo.Entity.Task;
import com.example.demo.Mapper.TaskMapper;
import com.example.demo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.TaskNamespaceHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskMapper taskMapper;

    @Override
    public Task findTaskByID(Integer Task_ID) {
        return taskMapper.findTaskByID(Task_ID);
    }

    @Override
    public Integer findTaskIdByName(String Task_name) {
        return taskMapper.findTaskIdByName(Task_name);
    }

    @Override
    public Integer addTask(Task task) {
        return taskMapper.addTask(task);
    }

    @Override
    public void deleteTaskByName(String Task_name) {
        taskMapper.deleteTaskByName(Task_name);
    }

    @Override
    public Integer findUserIdByTaskId(String Task_ID) {
        return taskMapper.findUserIdByTaskId(Task_ID);

    }

    @Override
    public Integer editPlanByID(Task task) {
        return taskMapper.editPlanByID(task);
    }

}
