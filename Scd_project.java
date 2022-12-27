package main;
import java.sql.*;
public class Scd_project {
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from customer");

			while(rs.next())
			{
			System.out.println("Customer_id: " + rs.getInt(1) + " Customer_Name: " + rs.getString(2)+ " Phone_no: " + rs.getInt(3) + " Address: "
			+ rs.getString(4));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
	}
}
