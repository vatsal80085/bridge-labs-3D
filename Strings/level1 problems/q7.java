import java.util.*;

public class q7 {
    static void generateException(String text) {
        int num = Integer.parseInt(text); // may fail
        System.out.println("Number: " + num);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        // generateException(text);
        handleException(text);
    }
}
