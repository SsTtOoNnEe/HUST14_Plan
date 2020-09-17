package com.example.demo.ServiceImpl;

import com.example.demo.Entity.Manager;
import com.example.demo.Entity.User;
import com.example.demo.Mapper.ManagerMapper;
import com.example.demo.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerMapper managerMapper;

    @Override
    public List<Manager> findAllManagers() {
        return managerMapper.findAllManagers();
    }

    @Override
    public Manager getPwdByManagerName(String Manager_name, String Manager_pwd) {
        return managerMapper.getPwdByManagerName(Manager_name, Manager_pwd);
    }
    @Override
    public Integer ad_register(Manager manager) {
        return managerMapper.ad_register(manager);

    }
}
