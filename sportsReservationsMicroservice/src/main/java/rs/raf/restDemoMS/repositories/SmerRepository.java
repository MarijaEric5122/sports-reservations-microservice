package rs.raf.restDemoMS.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.raf.restDemoMS.model.Smer;
@Repository
public interface SmerRepository extends CrudRepository<Smer, Integer> {
}
