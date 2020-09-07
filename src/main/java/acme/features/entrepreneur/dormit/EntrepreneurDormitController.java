
package acme.features.entrepreneur.dormit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.dormits.Dormit;
import acme.entities.roles.Entrepreneur;

import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/entrepreneur/dormit/")
public class EntrepreneurDormitController extends AbstractController<Entrepreneur, Dormit> {

	@Autowired
	private EntrepreneurDormitShowService		showService;

	@Autowired
	private EntrepreneurDormitCreateService	createService;
	
	@Autowired
	private EntrepreneurDormitDelete deleteService;
	
	@Autowired 
	private EntrepreneurDormitUpdate updateService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		
		super.addBasicCommand(BasicCommand.DELETE, this.deleteService);
		
		super.addBasicCommand(BasicCommand.UPDATE, this.updateService);
	}

}
