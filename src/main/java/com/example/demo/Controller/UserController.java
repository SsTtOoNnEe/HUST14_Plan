package com.example.demo.Controller;


import com.example.demo.Entity.Task;
import com.example.demo.Entity.User;
import com.example.demo.Service.TaskService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("UserPage")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    TaskService taskService;

    @GetMapping("/register")
    public String getRegister(){
        return "user_register";
    }

    @PostMapping("/register")
    public String getRegister(User user){
        userService.register(user);
        return "redirect:/UserPage/register";
    }
    @GetMapping("/allplan")
    public String getAllPlanPage(Model model){

        User user = userService.findUserByID(1);
        String[] tasksID = user.getTasks_ID().split(",");

        List<Task> tasks = new ArrayList<>();

        for(int i=0;i<tasksID.length;i++){
            System.out.println(tasksID[i]);
            Task task = taskService.findTaskByID(Integer.parseInt(tasksID[i]));
            tasks.add(task);
        }


        model.addAttribute("user",user);
        model.addAttribute("tasks",tasks);

<<<<<<< HEAD
        return "test1";
    }

    @PostMapping("/userLogin")
    public String userLogin(){
        User user = userService.findUserByName("");
        return "test1";
    }


    @GetMapping("/testPage")
    public String testPage(){
        return "login";
    }
    

=======
        return "test1";
    }

>>>>>>> b9a48136c9d17921ac2093ba548dc8666651fee8
}
