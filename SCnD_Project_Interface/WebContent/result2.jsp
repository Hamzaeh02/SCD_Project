<%@page import="main.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Order Details</title>

</head>
<body style="opacity: .8;  background-color: rgba(0, 0, 0, 0.664);
background-image: linear-gradient(rgb(40, 40, 40), black); color: whitesmoke;">
<h1 style="text-align: center; background-color: black;color: azure ; border: 5px; box-shadow: 3px 4px  lightgray; padding: 10px;font-family: sans-serif;">Order Details</h1>
<div style = "border: 2px solid; border-color: white; text-align: center">
<%
Information info = new InformationServiceLocator().getInformation();
ItemDetails[] orderdetails = info.getOrderItems(Integer.parseInt(request.getParameter("orderId")));
for(int i=0;i<orderdetails.length;i++){
out.println("<br>Item Name: "+orderdetails[i].getItemName());
out.println("<br>Quantity: "+orderdetails[i].getQuantity());
}
%>
</div>
</body>
</html>