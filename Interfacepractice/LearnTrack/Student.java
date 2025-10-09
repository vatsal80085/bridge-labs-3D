package Interfacepractice.LearnTrack;

import java.util.UUID;

public class Student extends User {
    private String studentId;

    // Constructor overloading: with and without ID
    public Student(String name, String email) {
        super(name, email);
        this.studentId = UUID.randomUUID().toString();
    }

    public Student(String name, String email, String studentId) {
        super(name, email);
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Student] " + name + " (" + studentId + ")");
    }
}

