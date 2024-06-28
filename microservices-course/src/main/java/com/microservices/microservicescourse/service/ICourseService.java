package com.microservices.microservicescourse.service;

import com.microservices.microservicescourse.entities.Course;
import com.microservices.microservicescourse.http.response.StudentByCourseResponse;

public interface ICourseService extends ICrud<Course, Long> {


    StudentByCourseResponse findByAllStudentByCourse(Long idCourse);

}
