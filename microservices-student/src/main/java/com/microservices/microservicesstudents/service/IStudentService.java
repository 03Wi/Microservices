package com.microservices.microservicesstudents.service;

import com.microservices.microservicesstudents.model.Student;

import java.util.List;

public interface IStudentService extends ICrud<Student, Long>{

    List<Student> findByAllStudentByCourse(Long idCourse);

}
