package com.microservices.microservicesstudents.controller;

import lombok.RequiredArgsConstructor;
import com.microservices.microservicesstudents.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.microservices.microservicesstudents.repository.IStudentRepo;

import java.util.List;

@RequiredArgsConstructor
@RestController()
@RequestMapping("api/student")
public class StudentController implements IControllerGeneric<Student, Long>{

    private final IStudentRepo service;

    @GetMapping("/find/{idCourse}")
    public ResponseEntity<List<Student>> findByAllStudentByCourse(@PathVariable Long idCourse) {
        return new ResponseEntity<>(service.findAllByIdCourse(idCourse), HttpStatus.OK);
    }

    @Override
    @GetMapping("/findAll")
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @Override
    @GetMapping("/findById/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id).orElseThrow());
    }

    @Override
    @PostMapping("/save")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return ResponseEntity.ok(service.save(student));
    }

    @Override
    public ResponseEntity<Void> deleteById( Long aLong) {
        service.deleteById(aLong);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
