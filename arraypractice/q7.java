package arraypractice;

import java.util.HashMap;

//frequency of each element
public class q7 {
    public static void main(String[] args) {
        int[] arr = {2,21,3,75,21,12};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //brute forcing
        boolean[] printed = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!printed[i]) {
                
                int count=0;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j]==arr[i]){
                        count++;
                        printed[j]=true;
                    }
                }
                System.out.println(arr[i]+" occurs "+count+" times");
            }
        }

        //using hashmap
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        System.out.println(map);

    }
}
