import java.util.*;

public class q11 {
    public static double[][] generateEmployees() {
        Random r = new Random();
        double[][] arr = new double[10][2];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = 10000 + r.nextInt(90000);
            arr[i][1] = r.nextInt(10) + 1;
        }
        return arr;
    }

    public static double[][] newSalaries(double[][] arr) {
        double[][] res = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double sal = arr[i][0];
            int yrs = (int) arr[i][1];
            double bonus = sal * (yrs > 5 ? 0.05 : 0.02);
            res[i][0] = sal + bonus;
            res[i][1] = bonus;
        }
        return res;
    }

    public static void main(String[] args) {
        double[][] emp = generateEmployees();
        double[][] ns = newSalaries(emp);

        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.println("Emp OldSal Years NewSal Bonus");

        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+" "+emp[i][0]+" "+(int)emp[i][1]+" "+ns[i][0]+" "+ns[i][1]);
            sumOld += emp[i][0]; sumNew += ns[i][0]; sumBonus += ns[i][1];
        }

        System.out.println("Total Old="+sumOld+" New="+sumNew+" Bonus="+sumBonus);
    }
}
