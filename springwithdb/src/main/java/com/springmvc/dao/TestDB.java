package com.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {
	
	private static Connection connect = null;
    private static Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			   Class.forName("com.mysql.jdbc.Driver");
	            // Setup the connection with the DB
	            connect = DriverManager
	                    .getConnection("jdbc:mysql://192.168.137.204:3306/myusers?user=root&password=password");
	            resultSet = statement.executeQuery("select * from users");
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
