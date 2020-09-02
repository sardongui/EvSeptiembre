
package acme.features.entrepreneur.application;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.applications.Application;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface EntrepreneurApplicationRepository extends AbstractRepository {
	
	@Query("select a from Application a where a.id = ?1")
	Application findOneById(int id);
	
	@Query("select a from Application a where a.investmentRound.entrepreneur.id = ?1 group by a.moment, a.ticker, a.statement")
	Collection<Application> findManyByEntrepreneurId(int entrepreneurId);
	
	
	
}
