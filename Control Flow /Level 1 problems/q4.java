import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0){
            System.out.println("Sum of "+n+" natural numbers: "+ (n*(n+1)/2));
        }
        else{
            System.out.println(n+ " is not a natural number");
        }
        sc.close();
    }
}