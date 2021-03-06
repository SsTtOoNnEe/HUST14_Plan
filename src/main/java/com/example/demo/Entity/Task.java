package com.example.demo.Entity;

public class Task {
    private Integer Task_ID;

    public Integer getTask_ID() {
        return Task_ID;
    }

    public void setTask_ID(Integer task_ID) {
        Task_ID = task_ID;
    }

    private String Task_name;
    private String Task_time;
    private Integer Task_type;
    private Integer Task_severity;
    private Integer Task_leftTime;


    public Integer getTask_leftTime() {
        return Task_leftTime;
    }

    public Integer getPercent(){
        double res = Task_leftTime*1.0/getTask_intTime()*100;
         int i = (int)res;
        return i;
    }
    public void setTask_leftTime(Integer task_leftTime) {
        Task_leftTime = task_leftTime;
    }

    public String getTask_name() {
        return Task_name;
    }

    public void setTask_name(String task_name) {
        Task_name = task_name;
    }

    public String getTask_time() {
        return Task_time;
    }

    public Integer getTask_intTime(){
        String str = getTask_time();
        return Integer.parseInt(str);
    }

    public void setTask_time(String task_time) {
        Task_time = task_time;
    }

    public Integer getTask_type() {
        return Task_type;
    }

    public void setTask_type(Integer task_type) {
        Task_type = task_type;
    }

    public Integer getTask_severity() {
        return Task_severity;
    }

    public void setTask_severity(Integer task_severity) {
        Task_severity = task_severity;
    }
}
