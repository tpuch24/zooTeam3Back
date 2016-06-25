import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public abstract class JpaDao<K, E> implements Dao<K, E> {
	protected Class<E> entityClass;
	@Inject
	// @PersistenceContext(unitName = "Ticket", type =
	// PersistenceContextType.EXTENDED)
	protected EntityManager entityManager;

	public JpaDao() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
	}

	public void persist(E entity) {
		// entityManager.getTransaction().begin();
		entityManager.persist(entity);
		// entityManager.getTransaction().commit();
	}

	public void remove(E entity) {
		entityManager.remove(entity);
	}

	public E findById(K id) {
		return entityManager.find(entityClass, id);
	}

	public Collection<E> findAll() {
		return null;
	}

}