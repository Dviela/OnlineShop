<%@include file="includes/header.jsp"%>

<form action="remove-customer" method="post">
  <div class="container">
    <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">ID Customer to delete</label>
        <textarea class="form-control" id="idCustomer" name="id" rows="1"></textarea>
    <div/>
      <br>
      <input class="btn btn-primary" type="submit" value="Delete">
  <div/>
</form>



<%@include file="includes/footer.jsp"%>
