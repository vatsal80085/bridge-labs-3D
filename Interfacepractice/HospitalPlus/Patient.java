package Interfacepractice.HospitalPlus;

public class Patient {
    private String patientId;
    private String patientName;
    private int age;
    private String contact;

    public Patient(String patientId, String patientName, int age, String contact) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.contact = contact;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getContact() {
        return contact;
    }
}
