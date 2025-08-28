package methodpractice;

public class q3 {
    public static void main(String[] args) {
        //write a program to generate a sequence of random 8 characters
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; 
        String otp = "";
        for (int i = 0; i < 8; i++) {
            int randomindex = (int)(Math.random()*characters.length());
            otp += ""+characters.charAt(randomindex);
        }
        System.out.println(otp);

    }
}
