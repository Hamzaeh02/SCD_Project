package main;

import java.sql.*;

public class Information {
	
 public OrderDetails getOrderDetails(int orderID)
 {
	 OrderDetails orderDetails = new OrderDetails();
	 
	 try{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con =
		 DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
		 Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery("SELECT customer.Name, customer.Phone_no, customer.Address,customerorder.payment_method FROM `customerorder`,customer WHERE customerorder.Customer_id=customer.id and customerorder.Order_id=" + orderID + ";");

		 rs.next();
		 
		 orderDetails.customerName = rs.getString(1);
		 orderDetails.phoneNumber = rs.getInt(2);
		 orderDetails.address = rs.getString(3);
		 orderDetails.paymentMethod = rs.getString(4);

		 con.close();
		 } catch(Exception e)
		 {
		 System.out.println(e);
		 }
	 
	 return orderDetails;
 }
	
}

