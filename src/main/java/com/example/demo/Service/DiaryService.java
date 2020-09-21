package com.example.demo.Service;

import com.example.demo.Entity.Diary;

public interface DiaryService {

    Diary findDiaryByID(Integer Diary_ID);

    Integer addDiary(String Diary_title,String Diary_content);

    Integer findDiaryIDByTitle(String Diary_title);

    Integer deleteDiaryByID(Integer Diary_ID);
}
