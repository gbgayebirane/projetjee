package gb.smart.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
public class Produit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nom;
    @Column
    private double qtStock;
    @OneToMany(mappedBy="produit")
    public List<Entree> entree=new ArrayList<Entree>();
	public Produit() {
		super();
	}
	public Produit(int id, String nom, double qtStock, List<Entree> entree) {
		super();
		this.id = id;
		this.nom = nom;
		this.qtStock = qtStock;
		this.entree = entree;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getQtStock() {
		return qtStock;
	}
	public void setQtStock(double qtStock) {
		this.qtStock = qtStock;
	}
	public List<Entree> getEntree() {
		return entree;
	}
	public void setEntree(List<Entree> entree) {
		this.entree = entree;
	}
    
}
