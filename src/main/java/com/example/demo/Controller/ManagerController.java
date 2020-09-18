package com.example.demo.Controller;


import com.example.demo.Entity.Manager;
import com.example.demo.Entity.User;
import com.example.demo.Service.ManagerService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("ManagerPage")
public class ManagerController {

    @Autowired
    UserService userService;

    @Autowired
    ManagerService managerService;

    @GetMapping("/index")
    public String getManagerIndex(){
        List<Manager> managers = managerService.findAllManagers();
        return "blank";
    }


    @GetMapping("/loginM")
    public String loginByManagerNameAndPwd() {
        return "admin_login";
    }

    @PostMapping("/selectPwd")
    public String selectPwd(String ManagerName, String ManagerPwd, Model model) {
        Manager manager = managerService.getPwdByManagerName(ManagerName, ManagerPwd);
        if (manager != null && manager.getManager_pwd().equals(ManagerPwd)) {
            System.out.println("登录成功！");
            List<User> users = userService.getAllUser();
            model.addAttribute("users", users);
            return "redirect:/ManagerPage/manager";

        } else {
            System.out.println("用户名或密码错误！");
            return "loginerrorM";
        }
    }

    @GetMapping("/ad_register")
    public String getManagerRegister(){
        return "administrator_register";
    }

    @PostMapping("/ad_register")
    public String getManagerRegister(Manager manager){
        managerService.ad_register(manager);
        return "redirect:/ManagerPage/loginM";
    }

    @GetMapping("/manager")
    public String man(Model model) {
        List<User> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "man";
    }

    @GetMapping("/delete_user/{User_name}")
    public String deleteUser(@PathVariable("User_name") String User_name, Model model){
        Integer i  = managerService.delete_user(User_name);
        Integer j = new Integer(2);
        return "redirect:/ManagerPage/manager";
    }

    @GetMapping("/alter_user/{User_name}")
    public String alterUser(@PathVariable("User_name") String User_name,Model model){
        User user = userService.findUserByName(User_name);

        model.addAttribute("user",user);
        return "alteruser";
    }

    @PostMapping("/alter_user")
    public String alterUser(User user){
        Integer i = userService.updateUserByName(user);
        return "redirect:/ManagerPage/manager";
    }

}
