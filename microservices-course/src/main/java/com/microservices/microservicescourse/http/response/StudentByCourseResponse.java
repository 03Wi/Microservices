package com.microservices.microservicescourse.http.response;


import com.microservices.microservicescourse.dto.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class StudentByCourseResponse {

    private String courseName;
    private String teacher;
    private List<StudentDto> studentDtoList;

}
