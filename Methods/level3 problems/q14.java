import java.util.*;

public class q14 {
    public static int[][] randomMatrix(int r, int c) {
        Random rand = new Random();
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) m[i][j] = rand.nextInt(10);
        return m;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] sub(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] mul(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int k = 0; k < a[0].length; k++) sum += a[i][k] * b[k][j];
                res[i][j] = sum;
            }
        }
        return res;
    }

    public static void print(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = randomMatrix(2, 2), B = randomMatrix(2, 2);
        print(A); System.out.println("+"); print(B);
        System.out.println("="); print(add(A, B));
    }
}
