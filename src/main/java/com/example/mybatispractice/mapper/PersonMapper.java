package com.example.mybatispractice.mapper;

import java.util.List;

import com.example.mybatispractice.dto.PersonDto;
import org.apache.ibatis.annotations.Mapper;

// mybatis 사용해서 데이터 접근하는 방법 1,2

// 방법 1. Mapper.xml 대신 어노테이션을 이용해 데이터 접근
@Mapper
public interface PersonMapper {
    List<PersonDto> findAll();

    PersonDto findByIdx(Long idx);

    void save(PersonDto personDto);
}
