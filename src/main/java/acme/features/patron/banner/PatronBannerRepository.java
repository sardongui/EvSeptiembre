
package acme.features.patron.banner;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.banners.Banner;
import acme.entities.customisations.Customisation;
import acme.entities.roles.Patron;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface PatronBannerRepository extends AbstractRepository {

	@Query("select b from Banner b where b.id = ?1")
	Banner findOneById(int id);

	@Query("select b from Banner b")
	Collection<Banner> findManyAll();

	@Query("select b from Banner b where b.patron.id = ?1")
	Collection<Banner> findManyByPatronId(int patronId);

	@Query("select p from Patron p where p.id = ?1")
	Patron findPatronById(int patronId);

	@Query("select c from Customisation c")
	Customisation findOneCustomisation();

	@Query("select distinct b from Banner b where b.creditCard.id=?1")
	Banner findCreditCardByBannerId(int creditCardId);

}
