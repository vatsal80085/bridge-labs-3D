package Interfacepractice.LearnTrack;

import java.util.ArrayList;
import java.util.List;

public // Course class managing enrolled users
class Course {
    private String title;
    private Teacher teacher;
    private List<Student> students;

    // Constructor overloading
    public Course(String title, Teacher teacher) {
        this.title = title;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public Course(String title) { // default teacher can be assigned later
        this(title, null);
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void displayCourseInfo() {
        System.out.println("\n=== Course: " + title + " ===");
        if (teacher != null) teacher.displayInfo();
        else System.out.println("No teacher assigned yet.");
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            s.displayInfo();
        }
    }
}
