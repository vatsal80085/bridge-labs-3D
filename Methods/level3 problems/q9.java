import java.util.*;

public class q9 {
    static String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean leap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    public static int firstDay(int m, int y) {
        Calendar c = Calendar.getInstance();
        c.set(y, m - 1, 1);
        return c.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public static void printCal(int m, int y) {
        int d = days[m - 1];
        if (m == 2 && leap(y)) d = 29;

        System.out.println("Calendar " + months[m - 1] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int start = firstDay(m, y);
        for (int i = 0; i < start; i++) System.out.print("    ");

        for (int i = 1; i <= d; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), y = sc.nextInt();
        printCal(m, y);
    }
}
