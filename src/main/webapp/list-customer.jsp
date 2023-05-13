<%@ page import="com.svalero.dao.Database" %>
<%@ page import="com.svalero.dao.CustomerDAO" %>
<%@ page import="com.svalero.domain.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.time.format.DateTimeFormatter" %>


<%@include file="includes/header.jsp"%>

<div class="album py-5 bg-light">
    <div class="container">

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
        <%
            Class.forName("com.mysql.cj.jdbc.Driver");
            Database.connect();
            List<Customer> customerList = Database.jdbi.withExtension(CustomerDAO.class, CustomerDAO::getCustomer);
            for (Customer customer : customerList) {
            out.println(customerList)


        %>
      </div>
    </div>
  </div>
<%@include file="includes/footer.jsp"%>