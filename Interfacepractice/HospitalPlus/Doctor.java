package Interfacepractice.HospitalPlus;

public class Doctor {
    private String doctorId;
    private String doctorName;
    private String specialty;

    public Doctor(String doctorId, String doctorName, String specialty){
        this.doctorId=doctorId;
        this.doctorName=doctorName;
        this.specialty=specialty;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getDoctorName(){
        return doctorName;
    }

    public String getSpecialty() {
        return specialty;
    }

}
