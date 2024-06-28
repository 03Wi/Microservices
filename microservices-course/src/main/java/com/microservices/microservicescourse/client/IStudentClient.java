package com.microservices.microservicescourse.client;

import com.microservices.microservicescourse.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "http://localhost:8090/api/student")
public interface IStudentClient {

    @GetMapping("/find/{idCourse}")
    List<StudentDto> findByAllStudentByCourse(@PathVariable("idCourse") Long idCourse);
}

