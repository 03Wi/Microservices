package com.microservices.microservicescourse.controller;

import com.microservices.microservicescourse.entities.Course;
import com.microservices.microservicescourse.http.response.StudentByCourseResponse;
import com.microservices.microservicescourse.service.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/course")
public class CourseController implements IControllerGeneric<Course, Long>{

    private final ICourseService repo;

    @GetMapping("/find/{idCourse}")
    public ResponseEntity<StudentByCourseResponse> findAllStudentByCourse(@PathVariable Long idCourse) {
        return new ResponseEntity<>(repo.findByAllStudentByCourse(idCourse), HttpStatus.OK);
    }

    @Override
    @GetMapping("/findAll")
    public ResponseEntity<List<Course>> findAll() {
        return ResponseEntity.ok(repo.findAll());
    }

    @Override
    @GetMapping("/find/id/{id}")
    public ResponseEntity<Course> findById(@PathVariable Long id) {
        return ResponseEntity.ok(repo.findById(id));
    }

    @PostMapping("/save")
    @Override
    public ResponseEntity<Course> save(@RequestBody Course course) {
        return new ResponseEntity<>(repo.save(course), HttpStatus.CREATED);
    }

    @Override
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteById(Long id) {
        repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
