import java.util.*;

public class q8 {
    static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }

    static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"A", "B", "C"};
        // generateException(names);
        handleException(names);
    }
}
