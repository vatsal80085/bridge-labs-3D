package arraypractice;
//sum of all elements in an array
public class q4 {
    public static void main(String[] args) {
        int[] arr = {2,3,51,10,10};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        
    }
}
