import java.util.*;

public class q3 {
    public static int[] getDigits(int n) {
        String s = "" + n;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int sum(int[] d) {
        int s = 0;
        for (int v : d) s += v;
        return s;
    }

    public static int sumSquares(int[] d) {
        int s = 0;
        for (int v : d) s += Math.pow(v, 2);
        return s;
    }

    public static boolean isHarshad(int n, int[] d) {
        return n % sum(d) == 0;
    }

    public static int[][] frequency(int[] d) {
        int[] count = new int[10];
        for (int v : d) count[v]++;
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = count[i];
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = getDigits(n);

        System.out.println("Sum: " + sum(d));
        System.out.println("SumSq: " + sumSquares(d));
        System.out.println("Harshad? " + isHarshad(n, d));

        int[][] f = frequency(d);
        System.out.println("Frequencies:");
        for (int[] row : f) if (row[1] > 0) System.out.println(row[0] + " -> " + row[1]);
    }
}
