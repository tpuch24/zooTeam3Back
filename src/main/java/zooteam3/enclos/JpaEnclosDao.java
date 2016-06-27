package zooteam3.enclos;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.Query;

import zooteam3.util.JpaDao;

@Stateless
public class JpaEnclosDao extends JpaDao<Integer, Enclos> implements EnclosDao{

//	@Override
//	public Collection<DisneyCharacter> findAll() {
//		return null;
//	}			

	

}
