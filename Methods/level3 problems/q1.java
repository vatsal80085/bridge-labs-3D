import java.util.*;

public class q1 {
    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }

    public static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static int min(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v < m) m = v;
        return m;
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v > m) m = v;
        return m;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) heights[i] = 150 + rand.nextInt(101);

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest = " + min(heights));
        System.out.println("Tallest = " + max(heights));
        System.out.println("Mean = " + mean(heights));
    }
}
