package gb.smart.dao;

import java.util.List;

import gb.smart.entities.Produit;

public interface IProduit {
	public int add(Produit produit);
	public List<Produit> getall();
	public Produit get(int id);
	public int update(Produit produit);
	public int update(int produit,double qt);
	public int delete(int id);
}
