
package acme.features.bookkeeper.accountingRecord;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import acme.entities.accountingRecords.AccountingRecord;

import acme.entities.roles.Bookkeeper;

import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/bookkeeper/accounting-record/")
public class BookkeeperAccountingRecordController extends AbstractController<Bookkeeper,AccountingRecord > {

	@Autowired
	private BookkeeperAccountingRecordListService		listService;
	
	@Autowired
	private BookkeeperAccountingRecordShowService			showService;
	

	@Autowired
	private BookkeeperAccountingRecordCreateService			createService;
	

	@Autowired
	private BookkeeperAccountingRecordUpdateService			updateService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		
		super.addBasicCommand(BasicCommand.UPDATE, this.updateService);

	}
}
