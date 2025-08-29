import java.util.Scanner;

public class q9 {

    // Frequency of characters
    public static void frequency(String str) {
        int[] freq = new int[256]; // ASCII range
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        frequency(input);
        sc.close();
    }
}