import java.util.*;

public class q9 {
    static String manualToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = manualToUpperCase(text);
        String builtin = text.toUpperCase();

        System.out.println("Manual UpperCase: " + manual);
        System.out.println("Built-in UpperCase: " + builtin);
        System.out.println("Equal? " + manual.equals(builtin));
    }
}
