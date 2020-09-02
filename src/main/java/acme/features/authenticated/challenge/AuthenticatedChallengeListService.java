
package acme.features.authenticated.challenge;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.challenges.Challenge;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedChallengeListService implements AbstractListService<Authenticated, Challenge> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AuthenticatedChallengeRepository repository;


	@Override
	public boolean authorise(final Request<Challenge> request) {
		assert request != null;
		Boolean res = false;
		Principal principal = request.getPrincipal();
		if (principal.isAuthenticated()) {
			res = true;
		}
		return res;
	}

	@Override
	public void unbind(final Request<Challenge> request, final Challenge entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "title", "deadline");
	}

	@Override
	public Collection<Challenge> findMany(final Request<Challenge> request) {
		assert request != null;
		Collection<Challenge> res = this.repository.findMany();
		return res;
	}

}
