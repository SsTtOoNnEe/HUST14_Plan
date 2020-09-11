package com.example.demo.Entity;

import java.util.Date;

public class User {
    private String User_name;
    private String User_pwd;
    private Integer User_sex;
    private Date User_bir;
    private String User_email;
    private String User_tagSchool;
    private String User_slogan;
    private String Tasks_ID;

    public String getTasks_ID() {
        return Tasks_ID;
    }

    public void setTasks_ID(String tasks_ID) {
        Tasks_ID = tasks_ID;
    }

    public String getUser_email() {
        return User_email;
    }

    public void setUser_email(String user_email) {
        User_email = user_email;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getUser_pwd() {
        return User_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        User_pwd = user_pwd;
    }

    public Integer getUser_sex() {
        return User_sex;
    }

    public void setUser_sex(Integer user_sex) {
        User_sex = user_sex;
    }

    public Date getUser_bir() {
        return User_bir;
    }

    public void setUser_bir(Date user_bir) {
        User_bir = user_bir;
    }

    public String getUser_tagSchool() {
        return User_tagSchool;
    }

    public void setUser_tagSchool(String user_tagSchool) {
        User_tagSchool = user_tagSchool;
    }

    public String getUser_slogan() {
        return User_slogan;
    }

    public void setUser_slogan(String user_slogan) {
        User_slogan = user_slogan;
    }
}
