package Interfacepractice.LearnTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        // ===== Default hardcoded data =====
        Teacher t1 = new Teacher("Alice", "alice@edu.com", "Mathematics");
        Teacher t2 = new Teacher("Bob", "bob@edu.com");
        teachers.add(t1);
        teachers.add(t2);

        Student s1 = new Student("John", "john@mail.com");
        Student s2 = new Student("Sara", "sara@mail.com", "S1002");
        students.add(s1);
        students.add(s2);

        Course c1 = new Course("Algebra 101", t1);
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        Course c2 = new Course("Web Basics", t2);
        c2.enrollStudent(s2);
        courses.add(c1);
        courses.add(c2);
        while (true) {
            System.out.println("\n--- LearnTrack Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Create Course");
            System.out.println("4. Assign Teacher to Course");
            System.out.println("5. Enroll Student in Course");
            System.out.println("6. Display All Courses");
            System.out.println("7. Render Course Content");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String sName = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String sEmail = sc.nextLine();
                    students.add(new Student(sName, sEmail));
                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.print("Enter Teacher Name: ");
                    String tName = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String tEmail = sc.nextLine();
                    System.out.print("Enter Expertise (or leave blank for General): ");
                    String exp = sc.nextLine();
                    teachers.add(exp.isEmpty() ? new Teacher(tName, tEmail)
                            : new Teacher(tName, tEmail, exp));
                    System.out.println("Teacher added!");
                    break;

                case 3:
                    System.out.print("Enter Course Title: ");
                    String cTitle = sc.nextLine();
                    courses.add(new Course(cTitle));
                    System.out.println("Course created!");
                    break;

                case 4:
                    if (courses.isEmpty() || teachers.isEmpty()) {
                        System.out.println("Add courses and teachers first.");
                        break;
                    }
                    for (int i = 0; i < courses.size(); i++)
                        System.out.println(i + ": " + courses.get(i).toString());
                    System.out.print("Choose course index: ");
                    int ci = sc.nextInt();
                    for (int i = 0; i < teachers.size(); i++)
                        System.out.println(i + ": " + teachers.get(i).name);
                    System.out.print("Choose teacher index: ");
                    int ti = sc.nextInt();
                    courses.get(ci).assignTeacher(teachers.get(ti));
                    System.out.println("Teacher assigned!");
                    break;

                case 5:
                    if (courses.isEmpty() || students.isEmpty()) {
                        System.out.println("Add courses and students first.");
                        break;
                    }
                    for (int i = 0; i < courses.size(); i++)
                        System.out.println(i + ": " + courses.get(i).toString());
                    System.out.print("Choose course index: ");
                    ci = sc.nextInt();
                    for (int i = 0; i < students.size(); i++)
                        System.out.println(i + ": " + students.get(i).name);
                    System.out.print("Choose student index: ");
                    int si = sc.nextInt();
                    courses.get(ci).enrollStudent(students.get(si));
                    System.out.println("Student enrolled!");
                    break;

                case 6:
                    if (courses.isEmpty()) {
                        System.out.println("No courses created.");
                        break;
                    }
                    for (Course course : courses) {
                        course.displayCourseInfo();
                    }
                    break;

                case 7:
                    System.out.println("Choose content type: 1.Video 2.PDF 3.HTML");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter content name: ");
                    String content = sc.nextLine();
                    CourseContentRenderer renderer = switch (type) {
                        case 1 -> new VideoRenderer();
                        case 2 -> new PDFRenderer();
                        case 3 -> new HTMLRenderer();
                        default -> null;
                    };
                    if (renderer != null) renderer.renderContent(content);
                    else System.out.println("Invalid type.");
                    break;

                case 8:
                    System.out.println("Exiting LearnTrack. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

    }
}