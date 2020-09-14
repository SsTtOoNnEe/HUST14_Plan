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
import org.springframework.web.bind.annotation.RequestParam;

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
        return "redirect:/UserPage/userLogin";
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

        return "test1";
    }

    @GetMapping("/userLogin")
    public String userLogin(){
        return "login";
    }

    @PostMapping("/userLogin")
    public String userLogin(String User_name,String User_pwd){
        User user = userService.findUserByName(User_name);
        System.out.println(user.getUser_pwd());
        return "allplan";
    }


    @GetMapping("/testPage")
    public String testPage(){
        return "login";
    }


}
