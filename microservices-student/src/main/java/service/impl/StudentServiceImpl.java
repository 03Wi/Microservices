package service.impl;

import lombok.RequiredArgsConstructor;
import model.Student;
import org.springframework.stereotype.Service;
import repository.IGenericRepo;
import repository.IStudentRepo;
import service.IStudentService;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl extends CrudImpl<Student, Long> implements IStudentService{

    private IStudentRepo repo;

    @Override
    public IGenericRepo<Student, Long> getRepo() {
        return repo;
    }

    @Override
    public Student findByAllStudent(Long idCourse) {
        return repo.findByAllStudent(idCourse);
    }
}
