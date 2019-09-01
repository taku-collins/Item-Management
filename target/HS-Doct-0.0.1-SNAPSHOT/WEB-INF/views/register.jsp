<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

    <form action="/HS-Doct/register.do" method="post"> 
        <label>Name:</label>
        <input type="text" name="uname"/> 
        <br/> 
        <label>User Name:</label>  
        <input type="text" name="user_name"/> 
        <br>
        <label>password:</label>
        <input type="password" name="password">
        <br>
        <br/><br/><br/> 
        <input type="submit" value="Ok"/> 
    </form> 

</body>
</html>