<%@include file="includes/header.jsp"%>

<form action="remove-product" method="post">
  <div class="container">
    <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">ID Product to delete</label>
        <textarea class="form-control" id="idProduct" name="id" rows="1"></textarea>
    <div/>
      <br>
      <input class="btn btn-primary" type="submit" value="Delete">
   <div/>
</form>
<%@include file="includes/footer.jsp"%>