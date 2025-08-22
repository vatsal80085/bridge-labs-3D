import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double yards = distanceInFeet / 3.0;          // 1 yard = 3 feet
        double miles = yards / 1760.0;                // 1 mile = 1760 yards

        System.out.println(distanceInFeet + " feet is equal to " + yards + " yards and " + miles + " miles.");
        input.close();
    }
}
