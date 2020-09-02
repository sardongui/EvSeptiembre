
package acme.features.authenticated.toolRecord;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.toolRecords.ToolRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedToolRecordListService implements AbstractListService<Authenticated, ToolRecord> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AuthenticatedToolRecordRepository repository;


	// PARA AUTHENTICATED
	@Override
	public boolean authorise(final Request<ToolRecord> request) {
		assert request != null;
		Boolean res = false;
		Principal principal = request.getPrincipal();
		if (principal.isAuthenticated()) {
			res = true;
		}
		return res;
	}

	@Override
	public void unbind(final Request<ToolRecord> request, final ToolRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "title", "sector", "stars");
	}

	@Override
	public Collection<ToolRecord> findMany(final Request<ToolRecord> request) {
		assert request != null;
		Collection<ToolRecord> result;
		result = this.repository.findManyAll();
		return result;
	}
}
