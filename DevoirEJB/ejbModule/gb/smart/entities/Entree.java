package gb.smart.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Entree 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
  
    @Column
    private double qtStockE;
    
   @ManyToOne
   private Produit produit =new Produit();

public Entree() {
	super();
}

public Entree(int id, double qtStockE, Produit produit) {
	super();
	this.id = id;
	this.qtStockE = qtStockE;
	this.produit = produit;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getQtStockE() {
	return qtStockE;
}

public void setQtStockE(double qtStockE) {
	this.qtStockE = qtStockE;
}

public Produit getProduit() {
	return produit;
}

public void setProduit(Produit produit) {
	this.produit = produit;
}
   
}
