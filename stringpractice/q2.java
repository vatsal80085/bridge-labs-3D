package stringpractice;

public class q2 {
    public static void main(String[] args) {
        //first non repeated character in a string
        String str = "swiss";
        char result = firstNonRepeatedCharacter(str);
        if (result != 0) {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static char firstNonRepeatedCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (str.indexOf(current) == str.lastIndexOf(current)) {
                return current;
            }
        }
        return 0;
    }
}
