package acme.features.investor.dormit;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.dormits.Dormit;
import acme.entities.roles.Investor;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class InvestorDormitListService implements AbstractListService<Investor, Dormit>{
	
	@Autowired
	InvestorDormitRepository repository;

	@Override
	public boolean authorise(Request<Dormit> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(Request<Dormit> request, Dormit entity, Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "text");
	}

	@Override
	public Collection<Dormit> findMany(Request<Dormit> request) {
		assert request != null;

		Collection<Dormit> result;
		Principal principal;

		principal = request.getPrincipal();
		result = this.repository.findMany();
		return result;
	}


}
