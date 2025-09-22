package Interfacepractice.HospitalPlus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    private static final List<Patient> defaultPatients = new ArrayList<>();
    private static final List<Doctor> defaultDoctors = new ArrayList<>();
    private static final List<Appointment> defaultAppointments = new ArrayList<>();    // Store defaults separately for option 8


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();
        List<Doctor> doctors = new ArrayList<>();
        List<Appointment> appointments = new ArrayList<>();

        // Default Data
        Patient dp1 = new Patient("P001", "Rahul Verma", 30, "9876543210");
        Patient dp2 = new Patient("P002", "Sneha Sharma", 25, "9876501234");
        defaultPatients.add(dp1);
        defaultPatients.add(dp2);

        Doctor dd1 = new Doctor("D001", "Dr. Agarwal", "Cardiology");
        Doctor dd2 = new Doctor("D002", "Dr. Mishra", "Dermatology");
        defaultDoctors.add(dd1);
        defaultDoctors.add(dd2);

        Appointment da1 = new Appointment("A001", dp1, dd1, LocalDateTime.of(2025, 9, 23, 10, 30));
        defaultAppointments.add(da1);

        // Preload defaults into main lists for general use
        patients.addAll(defaultPatients);
        doctors.addAll(defaultDoctors);
        appointments.addAll(defaultAppointments);

        int choice;
        do {
            System.out.println("\nHospitalPlus – Patient Management System`");
            System.out.println("1. Register Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("7. Generate Reports");
            System.out.println("8. View Default Values");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    String pid = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String pname = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();
                    patients.add(new Patient(pid, pname, age, contact));
                    System.out.println("Patient registered successfully!");
                    break;

                case 2:
                    System.out.print("Enter Doctor ID: ");
                    String did = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String dname = sc.nextLine();
                    System.out.print("Enter Specialty: ");
                    String spec = sc.nextLine();
                    doctors.add(new Doctor(did, dname, spec));
                    System.out.println("Doctor added successfully!");
                    break;

                case 3:
                    if (patients.isEmpty() || doctors.isEmpty()) {
                        System.out.println("Add at least one patient and one doctor first!");
                        break;
                    }
                    System.out.print("Enter Appointment ID: ");
                    String aid = sc.nextLine();

                    System.out.println("Select Patient:");
                    for (int i = 0; i < patients.size(); i++) {
                        System.out.println((i + 1) + ". " + patients.get(i).getName());
                    }
                    int pIndex = Integer.parseInt(sc.nextLine()) - 1;

                    System.out.println("Select Doctor:");
                    for (int i = 0; i < doctors.size(); i++) {
                        System.out.println((i + 1) + ". " + doctors.get(i).getDoctorName() +
                                " (" + doctors.get(i).getSpecialty() + ")");
                    }
                    int dIndex = Integer.parseInt(sc.nextLine()) - 1;

                    System.out.print("Enter Appointment DateTime (yyyy-MM-dd HH:mm): ");
                    String dateTimeStr = sc.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                    LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);

                    appointments.add(new Appointment(aid, patients.get(pIndex), doctors.get(dIndex), dateTime));
                    System.out.println("Appointment scheduled successfully!");
                    break;

                case 4:
                    System.out.println("\nPatients");
                    if (patients.isEmpty()) System.out.println("No patients registered.");
                    for (Patient p : patients) {
                        System.out.println(p.getPatientId() + " | " + p.getName() +
                                " | Age: " + p.getAge() + " | Contact: " + p.getContact());
                    }
                    break;

                case 5:
                    System.out.println("\nDoctors");
                    if (doctors.isEmpty()) System.out.println("No doctors added.");
                    for (Doctor d : doctors) {
                        System.out.println(d.getDoctorId() + " | " + d.getDoctorName() +
                                " | Specialty: " + d.getSpecialty());
                    }
                    break;

                case 6:
                    System.out.println("\nAppointments");
                    if (appointments.isEmpty()) System.out.println("No appointments scheduled.");
                    for (Appointment a : appointments) {
                        System.out.println(a.getAppointmentId() + " | Patient: " + a.getPatient().getName() +
                                " | Doctor: " + a.getDoctor().getDoctorName() +
                                " | DateTime: " + a.getDateTime());
                    }
                    break;

                case 7:
                    ReportGenerator appointmentReport = new AppointmentReport();
                    ReportGenerator patientReport = new PatientReport();
                    appointmentReport.generateReport();
                    patientReport.generateReport();
                    break;

                case 8:
                    System.out.println("\nDefault Patients");
                    for (Patient p : defaultPatients) {
                        System.out.println(p.getPatientId() + " | " + p.getName() +
                                " | Age: " + p.getAge() + " | Contact: " + p.getContact());
                    }
                    System.out.println("\nDefault Doctors");
                    for (Doctor d : defaultDoctors) {
                        System.out.println(d.getDoctorId() + " | " + d.getDoctorName() +
                                " | Specialty: " + d.getSpecialty());
                    }
                    System.out.println("\nDefault Appointments");
                    for (Appointment a : defaultAppointments) {
                        System.out.println(a.getAppointmentId() + " | Patient: " + a.getPatient().getName() +
                                " | Doctor: " + a.getDoctor().getDoctorName() +
                                " | DateTime: " + a.getDateTime());
                    }
                    break;

                case 0:
                    System.out.println("Exiting HospitalPlus. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
