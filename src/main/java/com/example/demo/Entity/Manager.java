package com.example.demo.Entity;

import java.util.Date;

public class Manager {
    private String Manager_name;
    private String Manager_pwd;
    private Integer Manager_sex;
    private Date Manager_bir;
    private String Manager_email;
    private String Manager_key;
    private String Manager_phone;

    public String getManager_phone() {
        return Manager_phone;
    }

    public void setManager_phone(String manager_phone) {
        Manager_phone = manager_phone;
    }

    public String getManager_name() {
        return Manager_name;
    }

    public void setManager_name(String manager_name) {
        Manager_name = manager_name;
    }

    public String getManager_pwd() {
        return Manager_pwd;
    }

    public void setManager_pwd(String manager_pwd) {
        Manager_pwd = manager_pwd;
    }

    public Integer getManager_sex() {
        return Manager_sex;
    }

    public void setManager_sex(Integer manager_sex) {
        Manager_sex = manager_sex;
    }

    public Date getManager_bir() {
        return Manager_bir;
    }

    public void setManager_bir(Date manager_bir) {
        Manager_bir = manager_bir;
    }

    public String getManager_email() {
        return Manager_email;
    }

    public void setManager_email(String manager_email) {
        Manager_email = manager_email;
    }

    public String getManager_key() {
        return Manager_key;
    }

    public void setManager_key(String manager_key) {
        Manager_key = manager_key;
    }
}
