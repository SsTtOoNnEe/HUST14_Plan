package com.example.demo.ServiceImpl;

import com.example.demo.Entity.Diary;
import com.example.demo.Mapper.DiaryMapper;
import com.example.demo.Service.DiaryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryServiceImpl implements DiaryService {

    @Autowired
    DiaryMapper diaryMapper;

    @Override
    public Diary findDiaryByID(Integer Diary_ID) {
        return diaryMapper.findDiaryByID(Diary_ID);
    }

    @Override
    public Integer addDiary(String Diary_title,String Diary_content) {
        return diaryMapper.addDiary(Diary_title,Diary_content);
    }

    @Override
    public Integer findDiaryIDByTitle(String Diary_title) {
        return diaryMapper.findDiaryIDByTitle(Diary_title);
    }

    @Override
    public Integer deleteDiaryByID(Integer Diary_ID) {
        return diaryMapper.deleteDiaryByID(Diary_ID);
    }
}
