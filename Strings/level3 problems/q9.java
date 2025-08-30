import java.util.Scanner;

public class q9 {
    static String[] months={"January","February","March","April","May","June","July",
                            "August","September","October","November","December"};
    static int[] days={31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean isLeap(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }

    static int getDayOfWeek(int d,int m,int y){
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        return (d+x+(31*m0)/12)%7;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m=sc.nextInt();
        System.out.print("Enter year: ");
        int y=sc.nextInt();
        int n=days[m-1];
        if(m==2 && isLeap(y)) n=29;
        System.out.println("   "+months[m-1]+" "+y);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int d0=getDayOfWeek(1,m,y);
        for(int i=0;i<d0;i++) System.out.print("   ");
        for(int i=1;i<=n;i++){
            System.out.printf("%2d ",i);
            if(((i+d0)%7==0)||i==n) System.out.println();
        }
        sc.close();
    }
}
