import java.util.*;

public class q13 {
    public static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) for (int j = 0; j < 3; j++) arr[i][j] = 10 + r.nextInt(90);
        return arr;
    }

    public static double[][] compute(int[][] scores) {
        double[][] res = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double pct = (total / 300.0) * 100;
            res[i][0] = total;
            res[i][1] = Math.round(avg * 100) / 100.0;
            res[i][2] = Math.round(pct * 100) / 100.0;
        }
        return res;
    }

    public static void display(int[][] s, double[][] r) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPct");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i][0]+"\t"+s[i][1]+"\t"+s[i][2]+"\t"+r[i][0]+"\t"+r[i][1]+"\t"+r[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] s = generateScores(n);
        double[][] r = compute(s);
        display(s, r);
    }
}
