package controllers;

// Import models
import models.Donation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DonationController {
    // JDBC URL, username, and password of the database
    private static final String JDBC_URL = "jdbc:mysql://localhost/paws_and_care";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345678";
    
    // JDBC variables for opening, closing, and managing the connection
    private Connection connection;

    public DonationController() {
        try {
            // Establish the connection to the database
        	Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR - Initializing connection");
        }
    }

    public int updateDonation(Donation donation) {
        try {
        	// Get the values from the object
        	String donator = donation.getDonator();
        	double amount = donation.getAmount();
        	String type = donation.getType();
        	String date = donation.getDate();
        	
            // Prepare the SQL statement for inserting data
            String query = "INSERT INTO donations (donator, donation_type, amount, donated_at) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, donator);
            statement.setString(2, type);
            statement.setDouble(3, amount);
            statement.setString(4, date);

            // Execute the statement
            int rowsAffected = statement.executeUpdate();
            return rowsAffected;
            
        } catch (SQLException e) {
            System.out.println("SQL Error - Insert donation into Database");
            return 0;
        }
    }
    
    
    // Get data for filling the table in the Pet registration
    public double getAccountBalance(){
        
        try {
        String query = """
                       SELECT SUM(CASE WHEN donation_type = 'Donation' THEN amount ELSE 0 END) - 
                       SUM(CASE WHEN donation_type = 'Withdraw' THEN amount ELSE 0 END) AS difference
                       FROM donations""";

        PreparedStatement statement = this.connection.prepareStatement(query);

        // Execute the query and get the result set
        ResultSet resultSet = statement.executeQuery();

        // Check if there are any results
        if (resultSet.next()) {
            // Get the difference value from the first row
            double difference = resultSet.getDouble("difference");
            return difference;
        } else {
            // No data found, consider returning a specific value or throwing an exception
            return 0.0;  // Or throw a custom exception
        }

    } catch (SQLException e) {
            System.out.println("SQL Error - Get Differnce from the database");
            return 0.0;
    }
    }
    
    
    // Get donation of a given person
    public double getAmountOf(String name, String type){
        
        try {
        String query = """
                       SELECT SUM(amount) 
                       FROM donations 
                       WHERE donator = ? AND donation_type = ?
                       """;
        
        // Prepare Statement
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setString(1, name);  
        statement.setString(2, type); 

        // Execute the query and get the result set
        ResultSet resultSet = statement.executeQuery();

        // Check if there are any results
        if (resultSet.next()) {
            // Get the sum value from the first row (assuming only one sum value)
            double sum = resultSet.getDouble(1);
            return sum;
        } else {
            // No data found, consider returning 0.0 or throwing an exception
            return 0.0;  // Or throw a custom exception
        }

    } catch (SQLException e) {
        System.out.println("SQL Error - Get Amount from the database");
        return 0.0;
    }
    }
    
    public double getAmountAt(String date, String type){
        
        try {
        String query = """
                       SELECT SUM(amount) 
                       FROM donations 
                       WHERE donated_at = ? AND donation_type = ?
                       """;
        
        // Prepare Statement
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setString(1, date);  
        statement.setString(2, type); 

        // Execute the query and get the result set
        ResultSet resultSet = statement.executeQuery();

        // Check if there are any results
        if (resultSet.next()) {
            // Get the sum value from the first row (assuming only one sum value)
            double sum = resultSet.getDouble(1);
            return sum;
        } else {
            // No data found, consider returning 0.0 or throwing an exception
            return 0.0;  // Or throw a custom exception
        }

    } catch (SQLException e) {
        System.out.println("SQL Error - Get Amount from the database");
        return 0.0;
    }
    }
    

}

