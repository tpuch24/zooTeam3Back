import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import model.Ticket;

@Singleton
@Startup
public class StartUpBean {

	// private static final String;

	@Inject
	TicketDao ticketDao;

	@PostConstruct
	public void init() {

		Ticket tck = new Ticket();
		tck.setCategory("Cat1");
		tck.setDate("date1");
		tck.setNumberSold(11);
		tck.setIncome(44);
		ticketDao.persist(tck);
		System.out.println("StartUpBean.init");
	}
}
