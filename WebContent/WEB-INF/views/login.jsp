<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

 <form action="login.do" method="post" >
     
<div class="card text-white bg-primary mb-3 d-inline-block" style="max-width: 20rem;"> 
   <div class="card-body">
 <h1 class="card-title">Login</h1>

<div>
    <label for="uname"><b>User name</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
    <br>
    </div> 
 
 
    <div class="form-group">
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
    <br>
    </div>
    
    <button type="submit" class="btn btn-success">Login</button>
  </div>
</form> 

<jsp:include page="staticV/footer.jsp"/>
</body>
</html>





