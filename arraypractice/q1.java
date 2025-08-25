package arraypractice;

public class q1 {
    public static void main(String[] args) {
        int elem=10;
        int[] arr = {2,3,51,10,10};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(elem==arr[i]){
                count++;
            }
        }
        System.out.println(elem+" appears "+count+" times");
    }

}
