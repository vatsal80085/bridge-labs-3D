import java.util.Scanner;

public class q10 {


    // Method to convert string to lowercase manually using charAt()
    public static String toLowerCaseManual(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is uppercase (A-Z), convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Difference between 'A' and 'a' is 32
            }

            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a text: ");
        String text = sc.nextLine();

        // User-defined lowercase conversion
        String manualLower = toLowerCaseManual(text);

        // Built-in method lowercase conversion
        String builtInLower = text.toLowerCase();

        // Compare results
        boolean isSame = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Manual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}