import java.util.Scanner;

public class q6 {

     // Convert lowercase to uppercase manually
    public static String toUpperCaseManual(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manual = toUpperCaseManual(input);
        String builtin = input.toUpperCase();

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtin);
        System.out.println("Same? " + compareStrings(manual, builtin));
        sc.close();
    }
}