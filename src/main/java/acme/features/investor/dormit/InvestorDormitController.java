
package acme.features.investor.dormit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.dormits.Dormit;
import acme.entities.roles.Investor;

import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/investor/dormit/")
public class InvestorDormitController extends AbstractController<Investor, Dormit> {

	@Autowired
	private InvestorDormitShowService		showService;
	

	@Autowired
	private InvestorDormitListService	listService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		
		super.addBasicCommand(BasicCommand.LIST, this.listService);
	}

}
