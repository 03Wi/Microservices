package com.microservices.microservicescourse.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentDto {

    private String name;
    private String lastName;
    private String email;
    private long idCourse;
}
