import java.util.Scanner;
class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        if (number > 0 && power >= 0) {
            int result = 1, counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println("Result = " + result);
        } else {
            System.out.println("Enter valid positive integers");
        }
        sc.close();
    }
}
