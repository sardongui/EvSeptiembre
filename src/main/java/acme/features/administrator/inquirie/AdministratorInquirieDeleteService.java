
package acme.features.administrator.inquirie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.inquiries.Inquirie;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractDeleteService;

@Service
public class AdministratorInquirieDeleteService implements AbstractDeleteService<Administrator, Inquirie> {

	// Internal state ------------------------------------------------------------------

	@Autowired
	AdministratorInquirieRepository repository;


	@Override
	public boolean authorise(final Request<Inquirie> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<Inquirie> request, final Inquirie entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Inquirie> request, final Inquirie entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "creationDate", "endDate", "description", "minMoney", "maxMoney", "email");

	}

	@Override
	public Inquirie findOne(final Request<Inquirie> request) {
		assert request != null;

		Inquirie res;
		int id;

		id = request.getModel().getInteger("id");
		res = this.repository.findOneInquireById(id);
		return res;
	}

	@Override
	public void validate(final Request<Inquirie> request, final Inquirie entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void delete(final Request<Inquirie> request, final Inquirie entity) {
		assert request != null;
		assert entity != null;

		this.repository.delete(entity);
	}

}
