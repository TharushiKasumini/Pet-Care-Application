package models;

// Model for animal
public class Animal {

    private String name;
    private String type; 	// e.g., Dog, Cat, etc.
    private int age;
    private String breed; 	
    private boolean adopted;

    public Animal(String name, String type, int age, String breed, boolean adopted) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.adopted = adopted;
    }

  
    // Getters and setters for all fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean getAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    // Additional methods for specific application logic (optional)
    public String getDetails() {
        return String.format("Name: %s, Type: %s, Breed: %s, Age: %d", name, type, age);
    }
}

