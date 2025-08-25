package arraypractice;
//copy of an array
public class q3 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,51,10,10};
        int[] copyarr=new int[arr1.length];
        for (int i = 0; i < copyarr.length; i++) {
            copyarr[i]=arr1[i];
        }
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print(copyarr[i]+" ");
        }
    }
}
