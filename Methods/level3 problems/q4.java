import java.util.*;

public class q4 {
    public static int[] getDigits(int n) {
        String s = "" + n;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) r[i] = d[d.length - 1 - i];
        return r;
    }

    public static boolean palindrome(int n) {
        int[] d = getDigits(n);
        return Arrays.equals(d, reverse(d));
    }

    public static boolean duck(int n) {
        int[] d = getDigits(n);
        for (int v : d) if (v == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Palindrome? " + palindrome(n));
        System.out.println("Duck? " + duck(n));
    }
}
