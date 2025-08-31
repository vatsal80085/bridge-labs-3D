import java.util.Scanner;

public class q11 {
    public static double[] quadraticRoots(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        if (delta < 0) return new double[0];
        else if (delta == 0) return new double[]{-b / (2*a)};
        else {
            double sqrtDelta = Math.sqrt(delta);
            double r1 = (-b + sqrtDelta) / (2*a);
            double r2 = (-b - sqrtDelta) / (2*a);
            return new double[]{r1, r2};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: "); double a = sc.nextDouble();
        System.out.print("Enter b: "); double b = sc.nextDouble();
        System.out.print("Enter c: "); double c = sc.nextDouble();
        double[] roots = quadraticRoots(a,b,c);
        if (roots.length == 0) System.out.println("No real roots");
        else {
            for (int i=0;i<roots.length;i++) System.out.println("Root " + (i+1) + ": " + roots[i]);
        }
        sc.close();
    }
}
