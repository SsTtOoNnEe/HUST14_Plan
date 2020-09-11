package com.example.demo.ServiceImpl;

import com.example.demo.Entity.Task;
import com.example.demo.Mapper.TaskMapper;
import com.example.demo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskMapper taskMapper;

    @Override
    public Task findTaskByID(Integer Task_ID) {
        return taskMapper.findTaskByID(Task_ID);
    }
}