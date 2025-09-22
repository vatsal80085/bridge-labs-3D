package Interfacepractice.HospitalPlus;

public class PatientReport implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating Report for Patients");
    }
}
