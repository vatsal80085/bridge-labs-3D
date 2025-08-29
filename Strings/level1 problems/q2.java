import java.util.*;

public class q2 {
    static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manual = manualSubstring(str, start, end);
        String builtin = str.substring(start, end);

        System.out.println("Manual substring: " + manual);
        System.out.println("Built-in substring: " + builtin);
        System.out.println("Are they equal? " + manual.equals(builtin));
    }
}
