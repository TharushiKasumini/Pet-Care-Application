package models;

public class Volunteer {

    private String name;
    private int age;
    private String mobile;
    private String address;
    private boolean availability;

    public Volunteer(String name, int age, String mobile, String address, boolean availability) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
        this.availability = availability;
    }


    // Getters and setters for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public boolean getAvailability(){
        return availability;
    }
    
    public void setAvailability(boolean availability){
        this.availability = availability;
    }

    // Additional methods for specific application logic (optional)
    public String getDetails() {
        return String.format("Name: %s, Age: %d, Mobile: %s", name, age, mobile);
    }
}

