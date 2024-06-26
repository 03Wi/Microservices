package com.microservices.microservicescourse.repository;

import com.microservices.microservicescourse.entities.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends IGenericRepo<Course, Long> {

}
