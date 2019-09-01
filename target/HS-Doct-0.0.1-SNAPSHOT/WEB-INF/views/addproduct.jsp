<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<form action = "addproduct.do" method ="post">
    
<div class="card-group">
<div class="card"> 
<div class="card-body">
    
<label>user id</label>
<input type = "number" name="id" >
<br>
<label>user Name</label>
<input type = "text" name="uname" >
<br>	
<label>Category:</label>
 <select name="category" size="5">
  <option value="Car">Car</option>
  <option value="Technology">Technology</option>
  <option value="Farsion">Farsion</option>
  <option value="General">General</option>
</select> 
<hr>
<br>

<label>Product Name</label>
<input type = "text" name="pname" >
<br>
<hr>

<br>
<hr>
<label>Description</label>
 <textarea name="Description" rows="3" cols="30">
The cat was playing in the garden.
</textarea>

<br>
<hr>
<label>Quantity</label>
<input type = "number" name="Quantity" >
<br>

<button type = "submit" class="btn btn-primary">Add</button>
<br>
</div>
</div>
</div>
</form>



</body>
</html>