package rs.raf.restDemoMS.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.raf.restDemoMS.model.Predmet;
@Repository
public interface PredmetRepository extends CrudRepository<Predmet, Integer> {
}
