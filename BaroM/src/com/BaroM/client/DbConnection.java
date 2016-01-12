package com.BaroM.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.BaroM.client.DbContract;;

public class DbConnection {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection(
					DbContract.HOST+DbContract.DB_NAME,
					DbContract.USERNAME,
					DbContract.PASSWORD);
			System.out.println("Database connected");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
