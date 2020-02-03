package gb.smart.dao;

import java.util.List;

import javax.ejb.Local;

import gb.smart.entities.Entree;


@Local
public interface IEntree {
	public int add(Entree entree);
	public List<Entree> getall();
	public Entree get(int id);
	public int update(Entree entree);
	public int delete(int id);
}
