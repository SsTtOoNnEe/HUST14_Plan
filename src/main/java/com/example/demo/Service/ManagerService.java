package com.example.demo.Service;

import com.example.demo.Entity.Manager;
import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerService {
    List<Manager> findAllManagers();

    Manager getPwdByManagerName(String Manager_name,String Manager_pwd);
}
