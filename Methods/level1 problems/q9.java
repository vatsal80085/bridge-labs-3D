import java.util.Scanner;

public class q9 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + res[1] + " chocolates, Remaining = " + res[0]);
        sc.close();
    }
}
