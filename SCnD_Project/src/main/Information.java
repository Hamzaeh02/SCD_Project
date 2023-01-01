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
	public ItemDetails[] getOrderItems(int orderID)
 {
	 ItemDetails[] itemDetails = null;
	 
	 try{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con =
		 DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
		 Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery("SELECT items.name,order_item_list.quantity FROM `order_item_list`,items WHERE order_item_list.item_id=items.id and order_item_list.Order_id=" + orderID + ";");

		 rs.last();
		 int size = rs.getRow();
		 rs.beforeFirst();
		 
		 itemDetails = new ItemDetails[size];
		 
		 int i = 0;
		 
		 while(rs.next())
		 {
			 itemDetails[i] = new ItemDetails();
					 
			 itemDetails[i].itemName = rs.getString(1);
			 itemDetails[i].quantity = rs.getInt(2);
			 
			 i++;
		 }
		 
		 con.close();
		 } catch(Exception e)
		 {
		 System.out.println(e);
		 }
	 return itemDetails;
 }
	public DeliveryDetails getDeliveryDetails(int OrderID)
	 {
		DeliveryDetails deliveryDetails = new DeliveryDetails();
		 
		 try{
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con =
			 DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			 Statement stmt=con.createStatement();
			 String Query = "SELECT rider.Name, rider.Phone_no,rider.vehicalid,delivery.Rider_id FROM `delivery`,rider WHERE delivery.Rider_id=rider.id and delivery.Order_id=" + OrderID + ";";
			 System.out.println(Query);
			 ResultSet rs=stmt.executeQuery(Query);

			 rs.next();
			 
			 deliveryDetails.riderName = rs.getString(1);
			 deliveryDetails.phoneNumber = rs.getLong(2);
			 deliveryDetails.vehicalid = rs.getString(3);
			 deliveryDetails.riderid = rs.getInt(4);
			 

			 con.close();
			 } catch(Exception e)
			 {
			 System.out.println(e);
			 }
		 
		 return deliveryDetails;
	 }
}
