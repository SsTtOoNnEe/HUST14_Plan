package com.example.demo.Mapper;

import com.example.demo.Entity.Diary;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DiaryMapper {

    @Select("select * from diary_info where Diary_ID=${Diary_ID}")
    Diary findDiaryByID(Integer Diary_ID);

    @Insert("insert into diary_info(Diary_content,Diary_createdTime) values(#{Diary_content},sysdate())")
    Integer addDiary(String Diary_content);

    @Select("select Diary_ID from diary_info where Diary_content=#{Diary_content}")
    Integer findDiaryIDByContent(String Diary_content);

}
