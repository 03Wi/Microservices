package controller;

import lombok.RequiredArgsConstructor;
import model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.IStudentRepo;

@RequiredArgsConstructor
@RestController()
@RequestMapping("api/student")
public class StudentController implements IControllerGeneric<Student, Long>{

    private final IStudentRepo service;

    @GetMapping("find/{idCourse}")
    public ResponseEntity<Student> findByAllStudent(@PathVariable Long idCourse) {
        return new ResponseEntity<>(service.findByAllStudent(idCourse), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Student> findAll() {
        return null;
    }
    @Override
    public ResponseEntity<Student> findById(Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return null;
    }

    @Override
    public ResponseEntity<Student> deleteById( Long aLong) {
        return null;
    }
}
