package rs.raf.restDemoMS.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.raf.restDemoMS.model.Profesor;
@Repository
public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {
}
