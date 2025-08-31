import java.util.*;

public class q12 {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] nums) {
        int min = nums[0], max = nums[0], sum = 0;
        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }
        double avg = sum / (double) nums.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println("Generated numbers: " + Arrays.toString(arr));
        double[] stats = findAverageMinMax(arr);
        System.out.println("Average = " + stats[0]);
        System.out.println("Min = " + stats[1]);
        System.out.println("Max = " + stats[2]);
    }
}
