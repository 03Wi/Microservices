package com.microservices.microservicescourse.service.impl;

import com.microservices.microservicescourse.client.IStudentClient;
import com.microservices.microservicescourse.dto.StudentDto;
import com.microservices.microservicescourse.entities.Course;
import com.microservices.microservicescourse.http.response.StudentByCourseResponse;
import com.microservices.microservicescourse.repository.ICourseRepo;
import com.microservices.microservicescourse.repository.IGenericRepo;
import com.microservices.microservicescourse.service.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl extends CrudImpl<Course, Long> implements ICourseService {

    private final ICourseRepo repo;

    private final IStudentClient client;

    @Override
    public IGenericRepo<Course, Long> getRepo() {
        return repo;
    }

    @Override
    public StudentByCourseResponse findByAllStudentByCourse(Long idCourse) {

        Course course = repo.getReferenceById(idCourse);

        List<StudentDto> byAllStudents = client.findByAllStudentByCourse(idCourse);

        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDtoList(byAllStudents)
                .build();
    }
}
