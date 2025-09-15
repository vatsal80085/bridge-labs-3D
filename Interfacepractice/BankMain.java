package Interfacepractice;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Bank_Service y = new Bank_Service();
        y.setBankDetails();
        int c = 1;
        int accNum = 0;

        while (true) {

            if (c == 1) {
                System.out.println("Enter your Account Number");
                accNum = scn.nextInt();
            }
            System.out.println(
                    "Enter the Operation number you want to perform \n1.Deposit \n2.Withdrawl \n3.BankBalance-Details \n4.Nothing");

            double amnt = 0;
            int op = scn.nextInt();
            if (op == 4) {
                break;
            }
            if (op != 3) {
                System.out.println("Enter Amount");
                amnt = scn.nextDouble();
                y.setBankDetails(accNum, op, amnt);
                // y.displayBank(accNum);
            } else {
                y.displayBank(accNum);
            }
            System.out.println("Do you want any other operations");
            String s = scn.next();
            if (s.equalsIgnoreCase("no")) {
                break;
            }
            c++;

            // y.displayBank(); //all data

        }
        scn.close();

    }
}