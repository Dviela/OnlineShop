<%@ page import="com.svalero.dao.Database" %>
<%@ page import="com.svalero.dao.ProductDAO" %>
<%@ page import="com.svalero.domain.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.time.format.DateTimeFormatter" %>

<%@include file="includes/header.jsp"%>


<main>

  <section class="py-5 text-center container">
    <div class="row py-lg-5">
      <div class="col-lg-6 col-md-8 mx-auto">
        <h1 class="fw-light">OnlineShop Gestor</h1>
        <p class="lead text-body-secondary">
Manage your online store comfortably and easily</p>
        <p>
          <a href="insert-product.jsp" class="btn btn-primary my-2">Insert Product</a>
        </p>
        <p>
          <a href="delete-product.jsp" class="btn btn-secondary my-2">Delete Product</a>
        </p>
        <p>
        <a href="insert-customer.jsp" class="btn btn-primary my-2">Insert Customer</a>
        </p>
        <p>
        <a href="delete-customer.jsp" class="btn btn-secondary my-2">Delete Customer</a>
        </p>
        <p>
        <a href="list-customer.jsp" class="btn btn-primary my-2">Customer List</a>
        </p>
        <p>
        <a href="list-product.jsp" class="btn btn-secondary my-2">Product List</a>
        </p>
      </div>

    </div>
  </section>
<%
            Class.forName("com.mysql.cj.jdbc.Driver");
            Database.connect();
%>


</main>

<%@include file="includes/footer.jsp"%>