package controllers;

// Import models
import models.Animal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PetController {
    // JDBC URL, username, and password of the database
    private static final String JDBC_URL = "jdbc:mysql://localhost/paws_and_care";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345678";
    
    // JDBC variables for opening, closing, and managing the connection
    private Connection connection;

    public PetController() {
        try {
            // Establish the connection to the database
        	Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR - Initializing connection");

        }
    }

    public int insertAnimal(Animal animal) {
        try {
        	// Get the values from the object
        	String name = animal.getName();
        	int age = animal.getAge();
        	String type = animal.getType();
        	String breed = animal.getBreed();
        	boolean adoptionStatus = animal.getAdopted();
        	
                // Prepare the SQL statement for inserting data
                String query = "INSERT INTO animal (name, age, type, breed, adoption_status) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setString(1, name);
                statement.setInt(2, age);
                statement.setString(3, type);
                statement.setString(4, breed);
                statement.setBoolean(5, adoptionStatus);

                // Execute the statement
                int rowsAffected = statement.executeUpdate();
                return rowsAffected;
            
        } 
        catch (SQLException e) {
            System.out.println("ERROR - Inserting pet details into database");
            return 0;
        }
    }
    
    
    public int updatePet(int ID) {
        try {
        	
            // Prepare the SQL statement for inserting data
            String query = "UPDATE animal SET adoption_status = 1 WHERE animal_id = ? ";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setInt(1, ID);

            // Execute the statement
            int rowsAffected = statement.executeUpdate();
            return rowsAffected;
            
        } 
        catch (SQLException e) {
            System.out.println("ERROR - Inserting pet details into database");
            return 0;
        }
    }
    
    
    // Get data for filling the table in the Pet registration
    public ResultSet getPetData(){
        
        try{
            String query = "SELECT name, type, adoption_status, breed FROM animal";
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
    
    // Get data for filling the table in the Pet registration
    public ResultSet getSinglePet(int ID){
        
        try{
            String query = "SELECT * FROM animal WHERE animal_id = ?";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setInt(1, ID);
            
            // Execute the query and retrieve the result set
            ResultSet results = statement.executeQuery();
            
            if (results.next()) {
                return results;
            } 
            else {
                return null; // No record found
            }

        }
        catch (SQLException e){
            System.out.println("SQL Error occurred");
        }
        return null;
    }
    
    // Get data for filling the table in the Pet registration
    public ResultSet getAllPetsAtType(String type){
        
        try{
            String query = "SELECT * FROM animal WHERE type = ? AND adoption_status = 0";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, type);
            
            // Execute the query and retrieve the result set
            ResultSet results = statement.executeQuery();
            
            return results;

        }
        catch (SQLException e){
            System.out.println("SQL Error occurred");
        }
        return null;
    }

}

