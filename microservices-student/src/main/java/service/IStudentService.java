package service;

import model.Student;
import org.springframework.stereotype.Service;
import repository.IStudentRepo;

public interface IStudentService extends ICrud<Student, Long>{

    Student findByAllStudent (Long idCourse);

}
