package Interfacepractice.HospitalPlus;

import java.time.LocalDateTime;

public class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime dateTime;

    Appointment(String appointmentId, Patient patient, Doctor doctor, LocalDateTime dateTime){
        this.appointmentId=appointmentId;
        this.patient=patient;
        this.doctor=doctor;
        this.dateTime=dateTime;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
