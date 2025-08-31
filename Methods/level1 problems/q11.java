import java.util.Scanner;

public class q11 {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("sin(" + angle + ") = " + res[0]);
        System.out.println("cos(" + angle + ") = " + res[1]);
        System.out.println("tan(" + angle + ") = " + res[2]);
        sc.close();
    }
}
