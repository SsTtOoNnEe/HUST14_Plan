package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("stu")
public class UserController {

    @GetMapping("/list")
    public String test(){
        return "index";
    }

    @GetMapping("/lit")
    public String test1(){
        return "index";
    }


}