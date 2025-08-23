import java.util.Scanner;
class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num, sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum += d * d * d;
            num /= 10;
        }
        if (sum == original) System.out.println("Armstrong Number");
        else System.out.println("Not Armstrong");
        sc.close();
    }
}
