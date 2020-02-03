<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste Professeur</title>
</head>
<body>
   <c:if test="${professeurs !=null }">
   <c:forEach items="${professeurs}" var="prof">
    <pre>${prof.id } ${prof.nomP} ${prof.prenomP} ${prof.salaire}</pre>
   </c:forEach>
   </c:if>
   
   <a href="Professeur">liste des professeurs</a>
</body>
</html> -->
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Devoir Miage EJB | GB SMART</title>
        <link rel="icon" type="image/x-icon" href="public/assets/images/favicons/favicon.ico" />
        <link rel="icon" type="image/png" href="public/assets/images/favicons/favicon.png" />
        <!-- For iPhone 4 Retina display: -->
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="public/assets/images/favicons/apple-touch-icon-114x114-precomposed.png">
        <!-- For iPad: -->
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="public/assets/images/favicons/apple-touch-icon-72x72-precomposed.png">
        <!-- For iPhone: -->
        <link rel="apple-touch-icon-precomposed" href="public/assets/images/favicons/apple-touch-icon-60x60-precomposed.png">
        <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,400italic' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="public/assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="public/assets/css/theme.min.css">
        <link rel="stylesheet" href="public/assets/css/color-defaults.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-beige-black.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-black-beige.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-black-white.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-black-yellow.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-blue-white.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-green-white.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-red-white.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-white-black.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-white-blue.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-white-green.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-white-red.min.css">
        <link rel="stylesheet" href="public/assets/css/swatch-yellow-black.min.css">
        <link rel="stylesheet" href="public/assets/css/fonts.min.css" media="screen">
    </head>
    <body>
        <header id="masthead" class="navbar navbar-sticky swatch-red-white" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".main-navbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="" class="navbar-brand">
                        <img src="public/assets/images/logo.png" alt="One of the best themes ever">Gestion Produit
                    </a>
                </div>
                <nav class="collapse navbar-collapse main-navbar" role="navigation">
                    <div class="sidebar-widget widget_search pull-right">
                        <form>
                            <div class="input-group">
                                <input class="form-control" type="text" placeholder="Search here....">
                                <span class="input-group-btn">
                            <button class="btn" type="submit">
                                <i class="fa fa-search"></i>
                            </button>
                        </span>
                            </div>
                        </form>
                    </div>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown ">
                            <a href="Produit" class="dropdown-toggle" data-toggle="dropdown">Produit</a>
                            
                        </li>
                        
                        <li class="dropdown ">
                            <a href="Entree" class="dropdown-toggle" data-toggle="dropdown">Entree Stock</a>
                            
                        </li>
                        
                    </ul>
                </nav>
            </div>
        </header>
        <section class="section swatch-white-red has-top">
                
                <div class="container ">
                    <header class="section-header underline">
                        <h1 class="headline super hairline">Liste des Lieux</h1>
                    </header>
                    <div class="row-fluid col-md-6">
                        <div class="span6">
                      
                             <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Nom Produit</th>
                                        <th>Quantite Stock</th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                 <c:if test="${produits !=null }">
									   <c:forEach items="${produits}" var="prof">
                                    <tr>
                                      
									   <td>${prof.id }</td>
                                        <td>${prof.nom}</td>
                                        <td>${prof.qtStock}</td>
                                      
									    
									   
                                    </tr>
                                    </c:forEach>
									   </c:if>
                                </tbody>
                            </table>
         
                        </div>
                    </div>
                    <div class="row-fluid col-md-6">
                        <div class="span6">
                      
                             <form  method="Post" action="Produit"  class="contact-form">
                                <div class="form-group form-icon-group">
                                    <input class="form-control" id="name" name="nom" placeholder="Nom Produit*" type="text" required/>
                                </div>
                                <div class="form-group form-icon-group">
                                    <input class="form-control" id="name" name="qtStock" placeholder="Quantite Stock *" type="text" required>
                                </div>
                                
                                <div class="form-group text-center">
                                 <input type="submit" value="Valider" name="valider" class="btn btn-primary btn-icon btn-icon-right" />
                                    
                                </div>
                            </form>
         
                        </div>
                    </div>
                </div>
            </section>