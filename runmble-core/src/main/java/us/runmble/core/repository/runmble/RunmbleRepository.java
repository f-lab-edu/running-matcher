package us.runmble.core.repository.runmble;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import us.runmble.core.domain.runmble.Runmble;

@Repository
public interface RunmbleRepository extends CrudRepository<Runmble, Long> {
}
