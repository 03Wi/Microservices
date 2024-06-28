package com.microservices.microservicesstudents.service.impl;

import lombok.RequiredArgsConstructor;
import com.microservices.microservicesstudents.model.Student;
import org.springframework.stereotype.Service;
import com.microservices.microservicesstudents.repository.IGenericRepo;
import com.microservices.microservicesstudents.repository.IStudentRepo;
import com.microservices.microservicesstudents.service.IStudentService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl extends CrudImpl<Student, Long> implements IStudentService{

    private final IStudentRepo repo;

    @Override
    public IGenericRepo<Student, Long> getRepo() {
        return repo;
    }

    @Override
    public List<Student> findByAllStudentByCourse(Long idCourse) {
        return repo.findAllByIdCourse(idCourse);
    }
}
