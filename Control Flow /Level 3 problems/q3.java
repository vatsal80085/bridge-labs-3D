import java.util.Scanner;
class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();
        int total = phy + chem + math;
        double per = total / 3.0;
        System.out.println("Average: " + per);
        if (per >= 80)
            System.out.println("Grade A");
        else if (per >= 70)
            System.out.println("Grade B");
        else if (per >= 60)
            System.out.println("Grade C");
        else if (per >= 50)
            System.out.println("Grade D");
        else
            System.out.println("Remedial");
        sc.close();
    }
}
