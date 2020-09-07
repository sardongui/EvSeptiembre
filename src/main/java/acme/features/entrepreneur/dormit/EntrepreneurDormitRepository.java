
package acme.features.entrepreneur.dormit;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.dormits.Dormit;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface EntrepreneurDormitRepository extends AbstractRepository {

	@Query("select r from Dormit r where r.id = ?1")
	Dormit findOneById(int id);

}
