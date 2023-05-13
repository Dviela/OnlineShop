<%@include file="includes/header.jsp"%>
  <body>
<form action="add-customer" method="post">
<div class="container">
  <div class="mb-3">
    <label for="exampleFormControlTextarea1" class="form-label">Name Customer</label>
    <textarea class="form-control" id="name-customer" name="name" rows="1"></textarea>
  </div>
  <div class="mb-3">
    <label for="exampleFormControlTextarea1" class="form-label">Delivery Address</label>
    <textarea class="form-control" id="adress" name="address" rows="3"></textarea>
  </div>

  <div class="mb-3">
     <label for="exampleFormControlInput1" class="form-label">Email address</label>
     <input type="email" class="form-control" id="email" name="email" placeholder="name@example.com">
  </div>
      <br>
      <input class="btn btn-primary" type="submit" value="Submit">
      </div>
</form>



<%@include file="includes/footer.jsp"%>
