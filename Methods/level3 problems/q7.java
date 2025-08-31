import java.util.*;

public class q7 {
    public static int[] factors(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) cnt++;
        int[] f = new int[cnt];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }

    public static int max(int[] f) {
        int m = f[0];
        for (int v : f) if (v > m) m = v;
        return m;
    }

    public static int sum(int[] f) {
        int s = 0;
        for (int v : f) s += v;
        return s;
    }

    public static int prod(int[] f) {
        int p = 1;
        for (int v : f) p *= v;
        return p;
    }

    public static int prodCubes(int[] f) {
        int p = 1;
        for (int v : f) p *= Math.pow(v, 3);
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = factors(n);

        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest = " + max(f));
        System.out.println("Sum = " + sum(f));
        System.out.println("Product = " + prod(f));
        System.out.println("Product of cubes = " + prodCubes(f));
    }
}
