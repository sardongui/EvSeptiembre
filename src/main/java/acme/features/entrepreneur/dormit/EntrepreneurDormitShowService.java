
package acme.features.entrepreneur.dormit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.dormits.Dormit;
import acme.entities.roles.Entrepreneur;
import acme.entities.roles.Investor;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractShowService;

@Service
public class EntrepreneurDormitShowService implements AbstractShowService<Entrepreneur, Dormit> {

	@Autowired
	EntrepreneurDormitRepository repository;


	@Override
	public boolean authorise(final Request<Dormit> request) {
		assert request != null;

		boolean result;
		Principal principal;

		principal = request.getPrincipal();
		result = principal.getActiveRole() == Investor.class;

		return result;
		

	}

	@Override
	public void unbind(final Request<Dormit> request, final Dormit entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "text");
		request.unbind(entity, model, "statement", "status", "moneyOffer", "investmentRound.ticker", "rejectionJustification");
	}

	@Override
	public Dormit findOne(final Request<Dormit> request) {
		assert request != null;

		Dormit result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
