package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Trainer 
{
public static void main(String[] args) 
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the id");
	int id = scanner.nextInt();
	System.out.println("enter the name");
	String name = scanner.next();
	System.out.println("enter the age");
	int age = scanner.nextInt();
	System.out.println("enter the designation");
	String designation = scanner.next();
	System.out.println("enter the subject");
	String subject = scanner.next();
	System.out.println("enter the salary");
	double sal = scanner.nextDouble();
	
	
	
	try
	{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/trainer","root","root");
PreparedStatement preparedStatement = connection.prepareStatement("insert into trainer values(?,?,?,?,?,?)");
preparedStatement.setInt(1, id);
preparedStatement.setString(2,name );
preparedStatement.setInt(3, age);
preparedStatement.setString(4, designation);
preparedStatement.setString(5, subject);
preparedStatement.setDouble(6,sal );
preparedStatement.execute();
connection.close();
System.out.println("data saved");

	}
	catch(ClassNotFoundException | SQLException e)
	  {
		e.printStackTrace();
	 }
}
}
