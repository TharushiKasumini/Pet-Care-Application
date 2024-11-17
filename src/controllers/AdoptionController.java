package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.ResultSet;

public class AdoptionController {
    // JDBC URL, username, and password of the database
    private static final String JDBC_URL = "jdbc:mysql://localhost/paws_and_care";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345678";
    
    // JDBC variables for opening, closing, and managing the connection
    private Connection connection;

    public AdoptionController() {
        try {
            // Establish the connection to the database
        	Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR - Initializing connection");

        }
    }

    public int insertAdoption(int volunteerID, String volunteerName, int petID, String petName) {
        try {
            
            LocalDate date = LocalDate.now();
            String dateText = date.toString();
            
            // Prepare the SQL statement for inserting data
            String query = "INSERT INTO adoptions (volunteer, volunteer_id, pet, pet_id, adopted_date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, volunteerName);
            statement.setInt(2, volunteerID);
            statement.setString(3, petName);
            statement.setInt(4, petID);
            statement.setString(5, dateText);

            // Execute the statement
            int rowsAffected = statement.executeUpdate();
            return rowsAffected;
            
        } catch (SQLException e) {
            System.out.println("ERROR - Inserting pet details into database");
            return 0;
        }
    }
    
    public ResultSet getAdoptionData(){
        
        try{
            
            String query = "SELECT * FROM adoptions";
            PreparedStatement statement = this.connection.prepareStatement(query);
            
            ResultSet resultSet = statement.executeQuery();
            
            return resultSet;
            
        }
        catch (SQLException e){
            System.out.println("ERROR - SQL Error getting data");
            return null;
        }
    }   
    
}


