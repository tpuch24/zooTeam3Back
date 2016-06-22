

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

//@Stateful
public class TicketManager implements TicketManagerInterface{
    static private ArrayList<Ticket> list = new ArrayList<>();
    private int comp=0;

    @PostConstruct
    void initListe()
    {
    	if (list.isEmpty())
    	{ 
	        list.add(new Ticket(0, 70, "Individuel1", "06/06/1916", 10));
	        list.add(new Ticket(1, 150, "Groupe1", "06/06/1916", 2));
	        list.add(new Ticket(2, 30, "Enfant1", "06/06/1916", 15));
	        comp=2;
    	}
    }

    public void add(Ticket tck)
    {
    	comp++;
    	tck.setId(comp);
        list.add(tck);
    }

    public void update(Ticket tck)
    {
        list.set(tck.getId(), tck);
    }

    public void delete(int id)
    {
        list.remove(id);
        comp--;
    }

    public ArrayList<Ticket> getList()
    {
        return list;
    }
    
    public ArrayList<Ticket> getList(List<Ticket> listRepos)
    {
        list = new ArrayList<Ticket>(listRepos);
        return list;
    }

    public Ticket getOneById(int pos)
    {
        return list.get(pos);
    }
}
