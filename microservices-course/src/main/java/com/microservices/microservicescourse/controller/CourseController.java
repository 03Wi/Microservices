package com.microservices.microservicescourse.controller;

import com.microservices.microservicescourse.entities.Course;
import com.microservices.microservicescourse.service.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("api/course")
@RestController
@RequiredArgsConstructor
public class CourseController implements IControllerGeneric<Course, Long>{

    private ICourseService repo;

    @GetMapping("/all")
    @Override
    public ResponseEntity<List<Course>> findAll() {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Course> findById(Long aLong) {
        return null;
    }

    @PostMapping("/save")
    @Override
    public ResponseEntity<Course> save(@RequestBody Course course) {
        return new ResponseEntity<>(repo.save(course), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Course> deleteById(Long aLong) {
        return null;
    }
}
