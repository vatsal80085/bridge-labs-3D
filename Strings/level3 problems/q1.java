import java.util.Scanner;

public class q1 {

    // Calculate BMI
    public static String[] calculateBMI(double[][] data) {
        String[] results = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0; // convert cm to m
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";
            results[i] = String.format("%.1f (%s)", bmi, status);
        }
        return results;
    }

    public static void display(double[][] data, String[] bmi) {
        System.out.printf("%-10s %-10s %-20s\n", "Weight", "Height", "BMI (Status)");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10.1f %-10.1f %-20s\n", data[i][0], data[i][1], bmi[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[] bmi = calculateBMI(data);
        display(data, bmi);
        sc.close();
    }
}
