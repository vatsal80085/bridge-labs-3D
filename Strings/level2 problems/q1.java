import java.util.Scanner;

public class q1 {
    
    // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  // will throw exception when count is out of bounds
                count++;
            }
        } catch (Exception e) {
            // when exception occurs, return count
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = findLength(input);
        int builtinLength = input.length();

        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length(): " + builtinLength);

        sc.close();
    }
}
