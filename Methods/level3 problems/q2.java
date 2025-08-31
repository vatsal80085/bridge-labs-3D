import java.util.*;

public class q2 {
    public static int[] getDigits(int n) {
        String s = "" + n;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static boolean isDuck(int[] d) {
        for (int v : d) if (v == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] d, int n) {
        int pow = d.length, sum = 0;
        for (int v : d) sum += Math.pow(v, pow);
        return sum == n;
    }

    public static int[] largestTwo(int[] d) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int v : d) {
            if (v > first) {
                second = first;
                first = v;
            } else if (v > second && v != first) {
                second = v;
            }
        }
        return new int[]{first, second};
    }

    public static int[] smallestTwo(int[] d) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int v : d) {
            if (v < first) {
                second = first;
                first = v;
            } else if (v < second && v != first) {
                second = v;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = getDigits(n);

        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Duck? " + isDuck(d));
        System.out.println("Armstrong? " + isArmstrong(d, n));
        System.out.println("Largest & 2nd: " + Arrays.toString(largestTwo(d)));
        System.out.println("Smallest & 2nd: " + Arrays.toString(smallestTwo(d)));
    }
}
