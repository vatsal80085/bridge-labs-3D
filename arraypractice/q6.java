package arraypractice;
//merge two arrays in one
public class q6 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,51,10,10};
        int[] arr2 = {10000,3,51,10,10};
        int n=arr1.length+arr2.length;
        int[] ansarr =new int[n];
        for (int i = 0; i < arr1.length; i++) {
            ansarr[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            ansarr[i+arr1.length]=arr2[i];
            
        }
        for (int i = 0; i < ansarr.length; i++) {
            System.out.print(ansarr[i]+" ");
        }
    }
}
