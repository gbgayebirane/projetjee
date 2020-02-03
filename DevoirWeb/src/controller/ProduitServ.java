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
import gb.smart.entities.Produit;


/**
 * Servlet implementation class Produit
 */
@WebServlet("/Produit")
public class ProduitServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
    private IProduit produitdao; 
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("produits", produitdao.getall());
		request.getRequestDispatcher("liste.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("valider") != null) {
			String nom = request.getParameter("nom").toString();
			Double qtsock = Double.parseDouble(request.getParameter("qtStock").toString());
			
			Produit p=new Produit();
			p.setNom(nom);
			p.setQtStock(qtsock);
			int ok = produitdao.add(p);
			request.setAttribute("result",ok);
			request.setAttribute("produits", produitdao.getall());
			request.getRequestDispatcher("liste.jsp").forward(request,response);
			}
	}

}
