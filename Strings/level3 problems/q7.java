import java.util.Scanner;

public class q7 {
    // Logic 1: Iterative
    public static boolean isPalindrome(String str) {
        int i=0, j=str.length()-1;
        while(i<j) {
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // Logic 2: Recursion
    public static boolean isPalindromeRec(String str, int i, int j) {
        if(i>=j) return true;
        if(str.charAt(i)!=str.charAt(j)) return false;
        return isPalindromeRec(str,i+1,j-1);
    }

    // Logic 3: Compare reverse
    public static boolean isPalindromeArray(String str) {
        char[] original = str.toCharArray();
        String rev="";
        for(int i=str.length()-1;i>=0;i--) rev+=str.charAt(i);
        return str.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();
        System.out.println("Iterative: " + isPalindrome(text));
        System.out.println("Recursive: " + isPalindromeRec(text,0,text.length()-1));
        System.out.println("Array/Reverse: " + isPalindromeArray(text));
        sc.close();
    }
}
