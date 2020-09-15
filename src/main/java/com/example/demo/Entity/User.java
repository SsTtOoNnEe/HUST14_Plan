package com.example.demo.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String User_name;
    private String User_pwd;

    public boolean isUser_sex() {
        return User_sex;
    }

    public void setUser_sex(boolean user_sex) {
        User_sex = user_sex;
    }

    private boolean User_sex;
    private Date User_bir;
    private String User_email;
    private String User_tagSchool;
    private String User_slogan;
    private String Tasks_ID;
    private String User_phone;
    private Integer User_learningTime;

    public Integer getUser_learningTime() {
        return User_learningTime;
    }

    public void setUser_learningTime(Integer user_learningTime) {
        User_learningTime = user_learningTime;
    }

    public String getUser_phone() {
        return User_phone;
    }

    public void setUser_phone(String user_phone) {
        User_phone = user_phone;
    }

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


    public String getUser_bir() {
        if(User_bir==null){
            return null;
        }
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(User_bir);
    }
  
    public Integer getUser_sex() {
        return User_sex;
    }

    public void setUser_sex(Integer user_sex) {
        User_sex = user_sex;
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
