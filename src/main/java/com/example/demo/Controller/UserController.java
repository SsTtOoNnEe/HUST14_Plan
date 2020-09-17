package com.example.demo.Controller;


import com.example.demo.Entity.Task;
import com.example.demo.Entity.User;
import com.example.demo.Service.TaskService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "redirect:/UserPage/login";

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
        return "user_login";
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

            return "loginerror";

        }
    }

    @GetMapping("/analysis/{User_name}")
    public String getUserAnalysis(@PathVariable("User_name") String User_name, Model model) {
        User user = userService.findUserByName(User_name);
        model.addAttribute("user", user);



        String[] tasksID = user.getTasks_ID().split(",");

        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < tasksID.length; i++) {
            System.out.println(tasksID[i]);
            Task task = taskService.findTaskByID(Integer.parseInt(tasksID[i]));
            tasks.add(task);
        }

        model.addAttribute("tasks", tasks);


        return "testchart";
    }


    @GetMapping("/settings/{User_name}")
    public String getUserSettings(@PathVariable("User_name") String User_name, Model model) {
        User user = userService.findUserByName(User_name);
        model.addAttribute("user", user);
        return "settings";
    }

    @PostMapping("/settings")
    public String updateUserByName(User user){
        userService.updateUserByName(user);
        String User_name = user.getUser_name();

        return "redirect:/UserPage/allplan/" +
                User_name;
    }


    @GetMapping("/addfriends/{User_name}/{Friend_name}")
    public String testPage(@PathVariable("User_name")String User_name,@PathVariable("Friend_name")String Friend_name) {
        Integer User_ID = userService.getIDbyUserName(User_name);
        Integer Friend_ID = userService.getIDbyUserName(Friend_name);
        userService.addFrind(User_ID,Friend_ID);
        return "redirect:/UserPage/addfriends/"+User_name;
    }


    @GetMapping("/rank/{User_name}")
    public String rankPage(@PathVariable("User_name") String User_name, Model model) {
        User user = userService.findUserByName(User_name);
        List<User> rankList = userService.rankMyFriend();
        model.addAttribute("user",user);
        model.addAttribute("rankList", rankList);
        return "rankoffriend";
    }

    @PostMapping("addplan/{User_name}")
    public String addNewPlan(@PathVariable("User_name") String User_name, Task task){

        Integer i = taskService.addTask(task);
        Integer task_id = taskService.findTaskIdByName(task.getTask_name());
        User user = userService.findUserByName(User_name);
        String tasks_id = user.getTasks_ID()+','+task_id;
        Integer j = userService.updateUserTasksID(tasks_id,User_name);

        return "redirect:/UserPage/allplan/"+User_name;
    }

    @PostMapping("deleteplan/{User_name}/{Task_name}")
    public String deletePlan(@PathVariable("User_name") String User_name,@PathVariable("Task_name") String Task_name, Task task){
        Integer task_id=taskService.findTaskIdByName(task.getTask_name());
        User user=userService.findUserByName(User_name);
        String tasks_id=user.getTasks_ID();
        String[] str=tasks_id.split(",");
        StringBuilder sb=new StringBuilder();
        for(String ss:str){
            if(ss.equals(task_id)){
                continue;
            }
            sb.append(ss+",");
        }
        System.out.println(sb.toString());
        tasks_id=sb.toString();
        Integer j=userService.updateUserTasksID(tasks_id,User_name);
        taskService.deleteTaskByName(Task_name);
        return "redirect:/UserPage/allplan/"+User_name;
    }

    @GetMapping("addfriends/{User_name}")
    public String friendList(@PathVariable("User_name")String User_name, Model model) {
        User user = userService.findUserByName(User_name);
        List<User> users = userService.getAllUser();

        model.addAttribute("users",users);
        model.addAttribute("user",user);
        return "addfriend";
    }

    @GetMapping("/startplan")
    public String getStartPlan(){
        return "startplan";
    }

    @GetMapping("/editplan")
    public String getEditPlan(){
        return "editplan";
    }

    @GetMapping("/pause/{User_name}/{taskId}")
    public String getPausePlan(Model model,@PathVariable("taskId") String taskId,@PathVariable("User_name") String User_name){
        Integer id = Integer.parseInt(taskId);
        Task task = taskService.findTaskByID(id);
        model.addAttribute("task",task);

        User user = userService.findUserByName(User_name);
        model.addAttribute("user",user);
        return "pauseplan";
    }


    @PostMapping("/testPage/{User_name}")
    public String postPauseTime(@PathVariable("User_name") String User_name,String taskId,String leftTime,Model model){
        Integer id = Integer.parseInt(taskId);
        userService.updateLeftTime(id,leftTime);

        User user = userService.findUserByName(User_name);
        model.addAttribute("user",user);
        return "redirect:/UserPage/pause/"+User_name+'/'+taskId;
    }

    @GetMapping("/testPage/{User_name}/{task_ID}")
    public String getTestPage(@PathVariable("task_ID") String taskId,@PathVariable("User_name") String User_name,Model model){
        Integer taskid = Integer.parseInt(taskId);
        Task task = taskService.findTaskByID(taskid);
        model.addAttribute("task",task);

        User user = userService.findUserByName(User_name);
        model.addAttribute("user",user);
        return "blank";
    }

    @GetMapping("/start/{User_name}/{task_ID}")
    public String getTestPage(Model model,@PathVariable("task_ID") String taskId,@PathVariable("User_name") String User_name){
        Integer taskid = Integer.parseInt(taskId);
        Task task = taskService.findTaskByID(taskid);

        model.addAttribute("task",task);
        return "redirect:/UserPage/testPage/"+User_name+"/"+taskId;
    }

    @GetMapping("/continueFromPause/{task_name}/{User_name}")
    public String continuePlan(@PathVariable("task_name") String taskName,@PathVariable("User_name") String User_name,Model model){
        Integer id = taskService.findTaskIdByName(taskName);
        String str =  id.toString();
        Task task = taskService.findTaskByID(id);
        model.addAttribute("task",task);
        return "redirect:/UserPage/testPage/"+User_name+'/'+id;
    }

}
