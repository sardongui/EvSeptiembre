
package acme.features.investor.dormit;


import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.dormits.Dormit;
import acme.entities.investmentRounds.InvestmentRound;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface InvestorDormitRepository extends AbstractRepository {

	@Query("select d from Dormit d where d.id =?1")
	Dormit findOneById(int id);
	
	@Query("select d from Dormit d")
	Collection<Dormit> findMany();
	
	@Query("select d from Dormit d where d.investmentRound.id=?1")
	Dormit findDormitByInvestmentRoundId(int investId);

	@Query("select ir from InvestmentRound ir where ir.id = ?1")
	InvestmentRound findInvestmentRoundById(int investId);

}

