package com.microservices.microservicesstudents.repository;

import com.microservices.microservicesstudents.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepo extends IGenericRepo<Student, Long> {

//    @Query("SElECT s FROM Student as s WHERE s.idCourse = :idCourse")
    List<Student> findAllByIdCourse(Long idCourse);
}
