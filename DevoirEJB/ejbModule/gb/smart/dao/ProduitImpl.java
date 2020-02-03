package gb.smart.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import gb.smart.entities.Produit;

@Stateless
public class ProduitImpl implements IProduit
{
	@PersistenceContext(unitName="DevoirEJB")
	private EntityManager em;
	@Override
	public int add(Produit produit) {
		int ok =0;
		try {
			///em.getTransaction().begin();
			em.persist(produit);
			//em.getTransaction().commit();
			ok=1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public List<Produit> getall() {
		return em.createQuery("select p from Produit p").getResultList();
	}

	@Override
	public Produit get(int id) {
		return (Produit)em.createQuery("SELECT a FROM Produit a WHERE a.id=:idA")
				.setParameter("idA", id)
				.getSingleResult();
	}

	@Override
	public int update(Produit produit) {
		try
		{
			em.merge(produit);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int produit, double qt) {
		
		
		return 0;
	}

}
