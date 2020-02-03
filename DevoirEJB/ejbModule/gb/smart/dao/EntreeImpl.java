package gb.smart.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import gb.smart.entities.Entree;

@Stateless
public class EntreeImpl implements IEntree{
	@PersistenceContext(unitName="DevoirEJB")
	private EntityManager em;
	@Override
	public int add(Entree entree) {
		int ok =0;
		try {
			///em.getTransaction().begin();
			em.persist(entree);
			//em.getTransaction().commit();
			ok=1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public List<Entree> getall() {
		return em.createQuery("select p from Entree p").getResultList();
	}

	@Override
	public Entree get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Entree entree) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
