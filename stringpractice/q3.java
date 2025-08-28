package stringpractice;

public class q3 {
    public static void main(String[] args) {
        //remove duplicate characters in a string
        String s="programming";
        String output="";
        for (int i = 0; i < s.length(); i++) {
            if(output.contains(("" + s.charAt(i)))){
                continue;
            }
            else{
                output+=s.charAt(i);
            }
        }
        System.out.println(output);
    }
}
