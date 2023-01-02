<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<style>
#two{
    background-color: #ff0157;
    border-color: #ff0157;
    padding: 10px;
    width: 20%;
    font-family: sans-serif;
    border-radius: 5px;
    box-shadow: 3px 4px  lightgray;
    font-size: 16px;
    color: whitesmoke;
    font-weight: 600;
}
#two:hover{
  background-color: #db628a;
}
    .design{
            margin-top: 200px;
      margin-left: 350px;
    }
</style>

</head>
<body style="opacity: .8;  background-color: rgba(0, 0, 0, 0.664);
        background-image: linear-gradient(rgb(40, 40, 40), black); color: whitesmoke;">
<h1 style="text-align: center; background-color: black;color: azure ; border: 5px; box-shadow: 3px 4px  lightgray; padding: 10px;font-family: sans-serif;">Delivery Details Form</h1>
        
			<div class="design">
			<form action = "result3.jsp">
			<h2>Enter Order ID for Delivery Details</h2>
			<label>OrderID:</label>
			<input name="orderId" type = "text"></input>
			<button type = "submit" id = "two">Submit</button>
			</form>
            </div>
   
</body>
</html>