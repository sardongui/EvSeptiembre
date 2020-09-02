
package acme.features.patron.banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.banners.Banner;
import acme.entities.roles.Patron;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractDeleteService;

@Service
public class PatronBannerDeleteService implements AbstractDeleteService<Patron, Banner> {

	@Autowired
	PatronBannerRepository repository;


	@Override
	public boolean authorise(final Request<Banner> request) {
		assert request != null;

		boolean result;
		Patron patron;
		Principal principal;

		patron = this.repository.findPatronById(request.getPrincipal().getActiveRoleId());
		principal = request.getPrincipal();
		result = patron.getUserAccount().getId() == principal.getAccountId();

		return result;
	}

	@Override
	public void bind(final Request<Banner> request, final Banner entity, final Errors errors) {

		assert request != null;
		assert entity != null;
		assert errors != null;
		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Banner> request, final Banner entity, final Model model) {

		assert request != null;
		assert entity != null;
		assert model != null;
		if (entity.getCreditCard() != null) {
			request.unbind(entity, model, "creditCard.holder", "creditCard.number", "creditCard.brand", "creditCard.month", "creditCard.year", "creditCard.cvv");
			request.unbind(entity, model, "picture", "slogan", "url");
		}

		request.unbind(entity, model, "picture", "slogan", "url");
		
	}

	@Override
	public Banner findOne(final Request<Banner> request) {

		Banner result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

	@Override
	public void validate(final Request<Banner> request, final Banner entity, final Errors errors) {

		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void delete(final Request<Banner> request, final Banner entity) {

		assert request != null;
		assert entity != null;

		if (entity.getCreditCard() != null) {
			this.repository.delete(entity.getCreditCard());
		}

		this.repository.delete(entity);

	}

}
