package stringpractice;

public class q4 {
    public static void main(String[] args) {
        //reverse each character in a word
        String s = "   Java is fun";
        String output = "";
        String[] words = s.split(" ");
        for (String word : words) {
            String reversed = "";
            for (int i = 0; i < word.length(); i++) {
                reversed = word.charAt(i) + reversed;
            }
            output += reversed + " ";
        }
        System.out.println(output);
    }
}
