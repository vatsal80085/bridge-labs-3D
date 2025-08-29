import java.util.Scanner;

public class q10 {

    // Replace character with another
    public static String replaceChar(String str, char oldChar, char newChar) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == oldChar) {
                result.append(newChar);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);

        System.out.println("Updated text: " + replaceChar(input, oldChar, newChar));
        sc.close();
    }
}