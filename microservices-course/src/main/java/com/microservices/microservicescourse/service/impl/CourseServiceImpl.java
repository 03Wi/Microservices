package com.microservices.microservicescourse.service.impl;

import com.microservices.microservicescourse.entities.Course;
import com.microservices.microservicescourse.repository.ICourseRepo;
import com.microservices.microservicescourse.repository.IGenericRepo;
import com.microservices.microservicescourse.service.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl extends CrudImpl<Course, Long> implements ICourseService {

    private ICourseRepo repo;

    @Override
    public IGenericRepo<Course, Long> getRepo() {
        return repo;
    }
}
