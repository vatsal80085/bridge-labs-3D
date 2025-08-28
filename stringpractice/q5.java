package stringpractice;

public class q5 {
    public static void main(String[] args) {
        //find frequency of a specific element in a string
        String str="banana";
        int count=0;
        char ch='a';
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
