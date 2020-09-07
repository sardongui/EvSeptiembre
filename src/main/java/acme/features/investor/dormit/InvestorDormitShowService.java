
package acme.features.investor.dormit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.dormits.Dormit;

import acme.entities.roles.Investor;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractShowService;

@Service
public class InvestorDormitShowService implements AbstractShowService<Investor, Dormit> {

	@Autowired
	InvestorDormitRepository repository;


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

//		model.setAttribute("investmentRoundId", entity.getInvestmentRound().getId());
//		request.unbind(entity, model, "text");
		
		Dormit d = this.repository.findOneById(request.getModel().getInteger("dormitId"));
		int investmentRoundId = d.getInvestmentRound().getId();
		
		request.unbind(entity, model, "text");

		model.setAttribute("investmentRoundId", investmentRoundId);
		
	}

	@Override
	public Dormit findOne(final Request<Dormit> request) {
		assert request != null;

		Dormit result;
		int id;

		id = request.getModel().getInteger("dormitId");
		result = this.repository.findOneById(id);

		return result;
	}

}
