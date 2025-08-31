import java.util.*;

public class q8 {
    public static int otp() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean unique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int v : arr) set.add(v);
        return set.size() == arr.length;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = otp();
            System.out.println(arr[i]);
        }
        System.out.println("All unique? " + unique(arr));
    }
}
