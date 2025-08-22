import java.util.Scanner;

public class startWithProblems {
    public static void main(String[] args) {
        //q1
        System.out.println("Welcome to Bridgelabz!");

        //q2
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1+num2);

        //q3
        System.out.println("Enter temperature in celsius");
        double celsius=sc.nextDouble();
        System.out.println("temperature in fahrenhiet is: "+ ((celsius*9/5)+22));

        //q4
        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        System.out.println("Area of circle is: "+ (Math.PI*radius*radius));

        //q5
        System.out.println("Enter radius of cylinder");
        double r = sc.nextDouble();
        System.out.println("Enter height of cylinder");
        double h = sc.nextDouble();
        System.out.println("Volume of cylinder is: "+ (Math.PI*r*r*h));

        //q6
        System.out.println("Enter Principal amount");
        double principal=sc.nextDouble();
        System.out.println("Enter rate amount");
        double rate=sc.nextDouble();
        System.out.println("Enter time amount");
        double time=sc.nextDouble();
        System.out.println("Simple interest is: "+ ((principal*rate*time)/100));

        //q7
        System.out.println("Enter length of rectangle");
        double l = sc.nextDouble() ;
        double b = sc.nextDouble();
        System.out.println("Perimeter of rectangle is "+ (2*l*b));

        //q8
        System.out.println("Enter base value:");
        int base=sc.nextInt();
        System.out.println("Enter exponent value: ");
        int exponent = sc.nextInt();
        System.out.println("Answer is: "+(Math.pow(base, exponent)));

        //q9
        System.out.println("Enter 3 numbers for average:");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        System.out.println("Average of these three numbers: "+ ((number1+number2+number3)/3));

        //q10
        System.out.println("Enter distance in kms");
        double kms = sc.nextDouble();
        double miles = kms*0.621371;
        System.out.println("Answer in miles is: "+miles);
        sc.close();
    }
}
