<%@include file="includes/header.jsp"%>
  <body>
<form>
  <div class="mb-3">
    <label for="exampleFormControlTextarea1" class="form-label">Name Product</label>
    <textarea class="form-control" id="nameProduct" rows="1"></textarea>
  </div>
  <div class="mb-3">
    <label for="exampleFormControlTextarea1" class="form-label">Description Product</label>
    <textarea class="form-control" id="description" rows="3"></textarea>
  </div>
    <div class="mb-3">
      <label for="exampleFormControlTextarea1" class="form-label">Price</label>
      <textarea class="form-control" id="price" rows="1"></textarea>
    </div>
    <div class="custom-file">
        <input type="file" class="custom-file-input" id="customFile">
        <label class="custom-file-label" for="customFile">Choose file</label>
      </div>
      <br>
      <input class="btn btn-primary" type="submit" value="Submit">
</form>



<%@include file="includes/footer.jsp"%>

