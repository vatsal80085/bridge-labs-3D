import java.util.Scanner;

public class q5 {
    public static char[] uniqueChars(String str) {
        char[] result = new char[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) result[count++] = c;
        }
        char[] finalRes = new char[count];
        System.arraycopy(result, 0, finalRes, 0, count);
        return finalRes;
    }

    public static void frequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) freq[str.charAt(i)]++;
        char[] unique = uniqueChars(str);
        for (char c : unique) {
            System.out.println(c + " -> " + freq[c]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        frequency(str);
        sc.close();
    }
}
