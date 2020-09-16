package com.example.demo.Controller;


import com.example.demo.Entity.Manager;
import com.example.demo.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("ManagerPage")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @GetMapping("/index")
    public String getManagerIndex(){
        List<Manager> managers = managerService.findAllManagers();
        return "blank";
    }

    @GetMapping("/ad_register")
    public String getManagerRegister(){
        return "administrator_register";
    }

    @PostMapping("/ad_register")
    public String getManagerRegister(Manager manager){
        managerService.ad_register(manager);
        return "redirect:/ManagerPage/ad_register";
    }

}
