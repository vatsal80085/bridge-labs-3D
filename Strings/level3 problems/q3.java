import java.util.Scanner;

public class q3 {
    public static char firstNonRepeating(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) return str.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        char res = firstNonRepeating(str);
        if (res == '\0') System.out.println("No non-repeating character");
        else System.out.println("First non-repeating char: " + res);
        sc.close();
    }
}
