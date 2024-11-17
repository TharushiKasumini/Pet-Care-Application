package models;

public class Donation {

    private String date;
    private String type;	// Cash or other
    private double amount;
    private String donator; 

    public Donation(String date, String type, double amount, String donator) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.donator = donator;
    }

    // Getters and setters for all fields

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDonator() {
        return donator;
    }

    public void setDonator(String donator) {
        this.donator = donator;
    }


    // Additional methods for specific application logic (optional)
    public String getDetails() {
        return String.format("Donation: %f, Type: %s, Donator: %s, Date: %s ", amount, type, donator, date);
    }
}

