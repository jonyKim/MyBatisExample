package com.example.mybatispractice.mapper;

import java.util.List;

import com.example.mybatispractice.dto.PersonDto;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

// mybatis 사용해서 데이터 접근하는 방법 1,2

// 방법 1. Mapper.xml 대신 어노테이션을 이용해 데이터 접근
@Mapper
public interface PersonMapper {
    @Select("SELECT * from person")
    List<PersonDto> findAll();

    @Select("SELECT * from person where idx = #{idx}")
    PersonDto findByIdx(Long idx);

    @Insert("INSERT INTO person(name, age, address) values (#{name},#{age},#{address})")
    void save(@Param("name") String name, @Param("age") String age, @Param("address") String address);
}
