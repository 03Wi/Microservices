package repository;

import model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends IGenericRepo<Student, Long> {

    @Query("SElECT s FROM Student as s WHERE s.idCourse = :idCourse")
    Student findByAllStudent (Long idCourse);
}
