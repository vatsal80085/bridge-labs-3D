import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Physics: ");
            phy[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chem[i] = sc.nextInt();
            System.out.print("Maths: ");
            math[i] = sc.nextInt();

            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("\nMarks\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(phy[i] + "," + chem[i] + "," + math[i] + "\t" + percent[i] + "\t" + grade[i]);
        }

        sc.close();
    }
}
