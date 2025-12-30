package rs.raf.restDemoMS.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.raf.restDemoMS.model.Student;

import java.util.List;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    @Query("select s from Student s where "
            + "(:first_name is null or lower(s.first_name) like :first_name) and "
            + "(:last_name is null or lower(s.last_name) like :last_name)")
    List<Student> findStudent(String first_name, String last_name);

}
