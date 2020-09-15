package com.example.demo.Controller;


import com.example.demo.Entity.Task;
import com.example.demo.Entity.User;
import com.example.demo.Service.TaskService;
import com.example.demo.Service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.PathVariableMethodArgumentResolver;

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
    public String getRegister() {
        return "user_register";
    }

    @PostMapping("/register")
    public String getRegister(User user){
        List<String> user_names=userService.getAllName();
        userService.register(user);
        for(String name:user_names){
            if(name.equals(user.getUser_name())){
                System.out.println("用户名重复");
                //return "redirect"
            }
        }
        return "redirect:/UserPage/register";

    }

    @GetMapping("/allplan/{User_name}")
    public String getAllPlanPage(@PathVariable("User_name") String User_name, Model model) {

        User user = userService.findUserByName(User_name);

        String[] tasksID = user.getTasks_ID().split(",");

        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < tasksID.length; i++) {
            System.out.println(tasksID[i]);
            Task task = taskService.findTaskByID(Integer.parseInt(tasksID[i]));
            tasks.add(task);
        }

        model.addAttribute("user", user);
        model.addAttribute("tasks", tasks);

        return "allplan";
    }


    @GetMapping("/login")
    public String loginByUserNameAndPwd() {
        return "login";
    }

    @PostMapping("/selectPwd")
    public String selectPwd(String UserName, String UserPwd) {
        User user = userService.getPwdByUserName(UserName, UserPwd);
        if (user != null && user.getUser_pwd().equals(UserPwd)) {
            System.out.println("登录成功！");
            return "redirect:/UserPage/allplan/" +
                    UserName;
        } else {
            System.out.println("用户名或密码错误！");
            return "login";
        }
    }

    @GetMapping("/analysis/{User_name}")
    public String getUserAnalysis(@PathVariable("User_name") String User_name, Model model) {
        User user = userService.findUserByName(User_name);
        model.addAttribute("user", user);
        return "testchart";
    }

    @GetMapping("/friends/{User_name}")
    public String getUserFriends(@PathVariable("User_name") String User_name, Model model) {
        User user = userService.findUserByName(User_name);
        model.addAttribute("user", user);
        return "friends";
    }

    @GetMapping("/settings/{User_name}")
    public String getUserSettings(@PathVariable("User_name") String User_name, Model model) {
        User user = userService.findUserByName(User_name);
        model.addAttribute("user", user);
        return "settings";
    }


    @GetMapping("/testPage")
    public String testPage() {
        return "blank";
    }


    @GetMapping("/rank")
    public String rankPage(Model model) {
        List<User> rankList = userService.rankMyFriend();
        model.addAttribute("rankList", rankList);
        return "rankoffriend";
    }

    @PostMapping("add/{User_name}")
    public String addNewPlan(@PathVariable("User_name") String User_name, Task task){

        Integer i = taskService.addTask(task);
        Integer task_id = taskService.findTaskIdByName(task.getTask_name());
        User user = userService.findUserByName(User_name);
        String tasks_id = user.getTasks_ID()+','+task_id;
        Integer j = userService.updateUserTasksID(tasks_id,User_name);

        return "redirect:/UserPage/allplan/"+User_name;
    }

    @GetMapping("/startplan")
    public String getStartPlan(){
        return "startplan";
    }

    @GetMapping("/editplan")
    public String getEditPlan(){
        return "editplan";
    }

    @GetMapping("/pause")
    public String getPausePlan(){
        return "pauseplan";
    }


    @PostMapping("/testPage")
    public String postPauseTime(String leftTime){
        userService.updateLeftTime(leftTime);
        return "redirect:/UserPage/pause";
    }

}
