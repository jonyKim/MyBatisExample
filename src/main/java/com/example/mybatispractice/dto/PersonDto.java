package com.example.mybatispractice.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonDto {
    private String name;
    private String age;
    private String address;

    public String toString() {
        return name + " " + age + " " + address;
    }
}
