package Interfacepractice.HospitalPlus;

public class AppointmentReport implements ReportGenerator {
    @Override
    public void generateReport(){
        System.out.println("Generating Reports for the doctor");
    }
}
