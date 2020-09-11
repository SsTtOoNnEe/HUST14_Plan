package com.example.demo.Controller;


import com.example.demo.Entity.Task;
import com.example.demo.Entity.User;
import com.example.demo.Service.TaskService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("UserPage")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    TaskService taskService;


    @GetMapping("/allplan")
    public String getAllPlanPage(Model model){

        User user = userService.findUserByID(1);
        String[] tasksID = user.getTasks_ID().split(",");

        List<Task> tasks = null;

        for(int i=0;i<tasksID.length;i++){
            Task task = taskService.findTaskByID(Integer.parseInt(tasksID[i]));
            tasks.add(task);
        }


        model.addAttribute("user",user);
        model.addAttribute("tasks",tasks);


        return "test1";
    }

}
