
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User ${username}</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
    </ul>
  </div>
</nav>
    
    
    
    
    
    
 <div class="container">  
     <div class="row">
         
         
         
         
 <div class="col-12 col-sm-6 col-lg-8">
<h1>Welcome  ${username}</h1>
<h3>You are successfully logged-in</h3>
<h1>Item</h1>
<div class="card-group">
<div class="card"> 
    <div class="card-body">
    
        <c:forEach items="${products}" var="product" >
            <ul>
            <div class="list-group">${product.id}</div>
            <p> ${product.userName}</p>
            <p> ${product.productName}</p>
       

 
                <a href="deleteproduct.do?p=${product.id}" name="Go" value="${product.id}"class="btn btn-primary">
                 Delete   
                </a>
                <a name="Go"  href="/EditProduct.do?E=${product.id} "class="btn btn-primary">Edit</a>
            </ul>
            <br>
         </c:forEach>
     
   </div>
  </div>
</div>
</div>
 </div>
    <div class="col-6 col-lg-4">
        <form action="addproduct.do" method="get">   
        <input type="submit" value="Add product" class="btn btn-primary">
        </form>   
    </div>


</div>


<jsp:include page="staticV/footer.jsp"/>
</body>
</html>


<!--
productGS{id=1,
productName=admin, 
userName=Car,
Description=lombongini, 
Category=fast carr. 
, Quantity=4}




-->