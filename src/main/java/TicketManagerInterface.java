import java.util.ArrayList;
import java.util.List;

import model.Ticket;

public interface TicketManagerInterface {

	public void add(Ticket tck);

	public void update(Ticket tck);

	public void delete(int id);

	public ArrayList<Ticket> getList();

	public ArrayList<Ticket> getList(List<Ticket> listRepos);

	public Ticket getOneById(int pos);
}
