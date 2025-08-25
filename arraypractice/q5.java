package arraypractice;
//check array is sorted in asc order 
public class q5 {
    public static void main(String[] args) {
        
        int[] arr = {2,3,51,10,10};
        boolean check=true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check=false;
            }
        }
        System.out.println(check);
    }
}
