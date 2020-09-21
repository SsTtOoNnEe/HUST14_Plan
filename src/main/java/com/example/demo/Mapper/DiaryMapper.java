package com.example.demo.Mapper;

import com.example.demo.Entity.Diary;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DiaryMapper {

    @Select("select * from diary_info where Diary_ID=${Diary_ID}")
    Diary findDiaryByID(Integer Diary_ID);

    @Insert("insert into diary_info(Diary_title,Diary_content,Diary_createdTime) values(#{Diary_title},#{Diary_content},sysdate())")
    Integer addDiary(@Param("Diary_title") String Diary_title,@Param("Diary_content") String Diary_content);

    @Select("select Diary_ID from diary_info where Diary_title=#{Diary_title}")
    Integer findDiaryIDByTitle(String Diary_title);

    @Delete("delete from diary_info where Diary_ID=${Diary_ID}")
    Integer deleteDiaryByID(Integer Diary_ID);

}
