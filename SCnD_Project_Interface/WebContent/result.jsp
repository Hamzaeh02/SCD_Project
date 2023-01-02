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
<h1 style="text-align: center; background-color: black;color: azure ; border: 5px; box-shadow: 3px 4px  lightgray; padding: 10px;font-family: sans-serif;">Customer Details</h1>
<div style = "border: 2px solid; border-color: white; text-align: center">
<%
Information info = new InformationServiceLocator().getInformation();
OrderDetails details = info.getOrderDetails(Integer.parseInt(request.getParameter("orderId")));
out.println("<br>Customer Name: "+details.getCustomerName());
out.println("<br>Customer PhoneNo: "+details.getPhoneNumber());
out.println("<br>Customer Address: "+details.getAddress());

%>
</div>
</body>
</html>