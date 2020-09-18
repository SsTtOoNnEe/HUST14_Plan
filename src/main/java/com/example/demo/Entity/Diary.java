package com.example.demo.Entity;

import java.sql.Date;

public class Diary {
    private Integer Diary_ID;
    private String Diary_content;
    private Date Diary_createdTime;

    public Integer getDiary_ID() {
        return Diary_ID;
    }

    public void setDiary_ID(Integer diary_ID) {
        Diary_ID = diary_ID;
    }

    public String getDiary_content() {
        return Diary_content;
    }

    public void setDiary_content(String diary_content) {
        Diary_content = diary_content;
    }

    public Date getDiary_createdTime() {
        return Diary_createdTime;
    }

    public void setDiary_createdTime(Date diary_createdTime) {
        Diary_createdTime = diary_createdTime;
    }
}
