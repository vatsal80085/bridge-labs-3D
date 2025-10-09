package Interfacepractice.LearnTrack;

public class Teacher extends User {
    private String expertise;

    // Constructor overloading
    public Teacher(String name, String email) {
        super(name, email);
        this.expertise = "General";
    }

    public Teacher(String name, String email, String expertise) {
        super(name, email);
        this.expertise = expertise;
    }

    public void displayInfo() {
        System.out.println("[Teacher] " + name + " | Expertise: " + expertise);
    }
}
