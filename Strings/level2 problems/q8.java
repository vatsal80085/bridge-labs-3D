import java.util.Scanner;

public class q8 {

     // Count words in a string
    public static int countWords(String str) {
        String trimmed = str.trim();
        if (trimmed.isEmpty()) return 0;
        int count = 1;
        for (int i = 0; i < trimmed.length(); i++) {
            if (trimmed.charAt(i) == ' ') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        System.out.println("Word count: " + countWords(input));
        sc.close();
    }
}