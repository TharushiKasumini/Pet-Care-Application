package controllers;

// Import models
import models.Volunteer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VolunteerController {
    // JDBC URL, username, and password of the database
    private static final String JDBC_URL = "jdbc:mysql://localhost/paws_and_care";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345678";
    
    // JDBC variables for opening, closing, and managing the connection
    private Connection connection;

    public VolunteerController() {
        try {
            // Establish the connection to the database
        	Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR - Initializing connection");
        }
    }

    public int addVolunteer(Volunteer volunteer) {
        try {
        	// Get the values from the object
        	String name = volunteer.getName();
        	int age = volunteer.getAge();
        	String address = volunteer.getAddress();
        	String mobile = volunteer.getMobile();
        	boolean availability = volunteer.getAvailability();
        	
                // Prepare the SQL statement for inserting data
                String query = "INSERT INTO volunteers (name, age, address, mobile_number, availability) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setString(1, name);
                statement.setInt(2, age);
                statement.setString(3, address);
                statement.setString(4, mobile);
                statement.setBoolean(5, availability);

                // Execute the statement
                int rowsAffected = statement.executeUpdate();
                return rowsAffected;
            
        } 
        catch (SQLException e) {
            System.out.println("SQL Error - Insert volunteer into Database");
            return 0;
        }
    }
    
    
    // Get data for filling the table in the Pet registration
    public ResultSet getVolunteerData(){
        
        try{
            String query = "SELECT name, age, address, mobile_number, availability FROM volunteers";
            PreparedStatement statement = this.connection.prepareStatement(query);
            
            // Execute the query and retrieve the result set
            ResultSet resultSet = statement.executeQuery();
            
            return resultSet;

        }
        catch (SQLException e){
            System.out.println("SQL Error occurred");
        }
        return null;
    }
    
    
    // Get volunteer Data for the selected user
    public ResultSet getSingleVolunteer(String name){
        
        try{
            String query = "SELECT * FROM volunteers WHERE name = ?";
            
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, name);
            
            // Excute the statement
            ResultSet results = statement.executeQuery();
            
            if (results.next()) {
                return results;
            } 
            else {
                return null; // No record found
            }
        }
        catch (SQLException e){
            System.out.println("SQL ERROR - Can't return the data from the database");
            return null;
        }
    }

}

