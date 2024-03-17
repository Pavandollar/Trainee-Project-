package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update
{
public static void main(String[] args) 
{
	try
	{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/trainer","root","root");
PreparedStatement preparedStatement = connection.prepareStatement("update trainer set sal = 90000 where designation = 'Devops' ");	
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