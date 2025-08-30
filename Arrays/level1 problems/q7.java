import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Error: Not a natural number.");
            sc.close();
            return;
        }
        
        int[] evens = new int[num / 2 + 1];
        int[] odds = new int[num / 2 + 1];
        int eIndex = 0, oIndex = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                evens[eIndex++] = i;
                else
                odds[oIndex++] = i;
            }
            
            System.out.print("Even numbers: ");
            for (int i = 0; i < eIndex; i++) System.out.print(evens[i] + " ");
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oIndex; i++) System.out.print(odds[i] + " ");
        sc.close();
    }
}
