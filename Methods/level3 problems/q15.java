import java.util.*;

public class q15 {
    public static int[][] randomMatrix(int r, int c) {
        Random rand = new Random();
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) m[i][j] = rand.nextInt(10);
        return m;
    }

    public static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) for (int j = 0; j < m[0].length; j++) t[j][i] = m[i][j];
        return t;
    }

    public static int det2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static void main(String[] args) {
        int[][] M = randomMatrix(2, 2);
        System.out.println("Matrix: ");
        for (int[] r : M) System.out.println(Arrays.toString(r));

        System.out.println("Transpose: ");
        for (int[] r : transpose(M)) System.out.println(Arrays.toString(r));

        System.out.println("Determinant = " + det2(M));
    }
}
