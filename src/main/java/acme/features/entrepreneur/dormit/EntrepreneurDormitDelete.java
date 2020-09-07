package acme.features.entrepreneur.dormit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.dormits.Dormit;
import acme.entities.roles.Entrepreneur;

import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.services.AbstractDeleteService;

@Service
public class EntrepreneurDormitDelete implements AbstractDeleteService<Entrepreneur, Dormit>{
	
	@Autowired
	EntrepreneurDormitRepository repository;

	@Override
	public boolean authorise(Request<Dormit> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(Request<Dormit> request, Dormit entity, Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
		
	}

	@Override
	public void unbind(Request<Dormit> request, Dormit entity, Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		
		request.unbind(entity, model, "text");
		
	}

	@Override
	public Dormit findOne(Request<Dormit> request) {
		assert request != null;
		Dormit result;
		int id;
		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);
		return result;
	}

	@Override
	public void validate(Request<Dormit> request, Dormit entity, Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		
	}

	@Override
	public void delete(Request<Dormit> request, Dormit entity) {
		assert request != null;
		assert entity != null;
		this.repository.delete(entity);
	
	}

}
