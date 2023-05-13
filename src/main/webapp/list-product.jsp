<%@ page import="com.svalero.dao.Database" %>
<%@ page import="com.svalero.dao.ProductDAO" %>
<%@ page import="com.svalero.domain.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.time.format.DateTimeFormatter" %>


<%@include file="includes/header.jsp"%>

<div class="album py-5 bg-light">
<div class="container">

       <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
       <%
       Class.forName("com.mysql.cj.jdbc.Driver");
       Database.connect();
       List<Product> productList = Database.jdbi.withExtension(ProductDAO.class, ProductDAO::getProduct);
       for (Product product : productList) {
       %>

            <div class="col">
              <div class="card shadow-sm">
                <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
                <div class="card-body">
                  <p class="card-text"><%= product.getDescription() %></p>
                  <div class="d-flex justify-content-between align-items-center">
                  </div>
                </div>
              </div>
            </div>
     <%
      }
      %>

      </div>
    </div>
  </div>

<%@include file="includes/footer.jsp"%>