package com.ty;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Details
{
public static void main(String[] args) 
{
	try
	{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/trainer","root","root");
PreparedStatement preparedStatement = connection.prepareStatement("");	
preparedStatement.execute();
connection.close();
System.out.println("Data Saved");
	
	
	}
	catch(ClassNotFoundException | SQLException e)
	  {
		e.printStackTrace();
	 }
}
}