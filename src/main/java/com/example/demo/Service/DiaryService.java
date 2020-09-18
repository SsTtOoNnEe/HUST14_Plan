package com.example.demo.Service;

import com.example.demo.Entity.Diary;

public interface DiaryService {

    Diary findDiaryByID(Integer Diary_ID);

    Integer addDiary(String Diary_content);

    Integer findDiaryIDByContent(String Diary_content);
}
