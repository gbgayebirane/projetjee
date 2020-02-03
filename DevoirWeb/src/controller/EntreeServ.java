package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gb.smart.dao.IEntree;
import gb.smart.dao.IProduit;
import gb.smart.entities.Entree;
import gb.smart.entities.Produit;

/**
 * Servlet implementation class Entree
 */
@WebServlet("/Entree")
public class EntreeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
    private IEntree entreedao; 
	@EJB
    private IProduit produitdao; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EntreeServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("entrees", entreedao.getall());
		request.setAttribute("produits", produitdao.getall());
		request.getRequestDispatcher("listeentree.jsp").forward(request,response);
		   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("valider") != null) {
		
			Double qtsock = Double.parseDouble(request.getParameter("qtStock").toString());
			int id = Integer.parseInt(request.getParameter("produit").toString());
			Produit p=produitdao.get(id);
			
			Entree e=new Entree();
			e.setQtStockE(qtsock);
			e.setProduit(p);
			int ok = entreedao.add(e);
			
			Produit pr=new Produit();
			pr.setId(id);
			pr.setNom(p.getNom());
			
			Double qt=p.getQtStock()+ qtsock;
			pr.setQtStock(qt);
			produitdao.update(pr);
			request.setAttribute("result",ok);
			request.setAttribute("entrees", entreedao.getall());
			request.getRequestDispatcher("listeentree.jsp").forward(request,response);
			}
	}

}
