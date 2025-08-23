import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Is the first number the largest?\nYes");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Is the second number the largest?\nYes");
        }
        else if(num3>num1 && num3>num2){
            System.out.println("Is the third number the largest?\nYes");
        }
        else{
            System.out.println("Either 2 of 3 numbers are equal");
        }
        sc.close();
    }
}
