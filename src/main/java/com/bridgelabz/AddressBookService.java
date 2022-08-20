package com.bridgelabz;
import java.sql.*;
public class AddressBookService{
	public static void main(String[] args) throws SQLException {
		
			System.out.println("Welcome to address book service");

			String jdbcUrl = "jdbc:mysql://localhost:3306/address_book_service";
			String userName = "root";
			String password = "Bhavesh@8448";
			Connection connection = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded");
				connection = DriverManager.getConnection(jdbcUrl, userName, password);
				System.out.println("Connection done...");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("Select * from addressbook");

				while (resultSet.next()) {
					System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4) + " " + resultSet.getString(5) + " " + resultSet.getString(6) + " " + resultSet.getString(7) + " " + resultSet.getString(8) + " " + resultSet.getString(9) );
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			} finally {
				connection.close();
			}
		}
	}


