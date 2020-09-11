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
import com.example.demo.util.*;

import java.util.List;

@Controller
@RequestMapping("UserPage")
public class UserController {

<<<<<<< HEAD
    @GetMapping("/list")
    public String test(){
        return "allplan";
    }

=======
    @Autowired
    UserService userService;
    TaskService taskService;
>>>>>>> b88de79c7a551085c1504d2b8dcbef1054739553

    @GetMapping("/allplan")
    public String getAllPlanPage(Model model){

        User user = userService.findUserByID();
        String[] tasksID = user.getTasks_ID().split(",");
        Task tasks = taskService.findTaskByID(1);


//        for(int i=0;i<tasksID.length;i++){
////            System.out.println(tasksID[i]);
//            Task task =  taskService.findTaskByID(Integer.parseInt(tasksID[i]));
//            tasks.add(task);
//        }

        model.addAttribute("user",user);
//        model.addAttribute("tasks",tasks);

        return "test1";
    }

}
