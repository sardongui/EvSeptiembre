
package acme.features.entrepreneur.dormit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.dormits.Dormit;
import acme.entities.investmentRounds.InvestmentRound;
import acme.entities.roles.Entrepreneur;
import acme.features.entrepreneur.investmentRound.EntrepreneurInvestmentRoundRepository;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractCreateService;

@Service
public class EntrepreneurDormitCreateService implements AbstractCreateService<Entrepreneur, Dormit> {

	@Autowired
	EntrepreneurDormitRepository			repository;
	
	@Autowired
	EntrepreneurInvestmentRoundRepository	investmentRoundRepository;

	@Override
	public boolean authorise(final Request<Dormit> request) {
		assert request != null;
		boolean result =true;

//		int id;
//		InvestmentRound investmentRound;
//		Entrepreneur entrepreneur;
//		Principal principal;
//
//		principal = request.getPrincipal();
//		id = request.getModel().getInteger("investmentRoundId");
//		investmentRound = this.investmentRoundRepository.findOneInvestmentRoundById(id);
//		entrepreneur = investmentRound.getEntrepreneur();
//		result = entrepreneur.getUserAccount().getId() == principal.getActiveRoleId();
//		if (investmentRound.getFinalMode() == true) {
//			result = false;
//		}
		return result;
	}

	@Override
	public void bind(final Request<Dormit> request, final Dormit entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Dormit> request, final Dormit entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		
		
		request.unbind(entity, model, "text");
//		model.setAttribute("investmentRoundId", entity.getInvestmentRound().getId());
	}

	@Override
	public Dormit instantiate(final Request<Dormit> request) {
		assert request != null;
		Dormit result;
		result = new Dormit();
		
		int id = request.getModel().getInteger("investmentRoundId");
		InvestmentRound investmentRound;

		investmentRound = this.investmentRoundRepository.findOneInvestmentRoundById(id);
		result.setInvestmentRound(investmentRound);
		return result;
	}

	@Override
	public void validate(final Request<Dormit> request, final Dormit entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Dormit> request, final Dormit entity) {
		assert request != null;
		assert entity != null;
	
		this.repository.save(entity);
	}

}
