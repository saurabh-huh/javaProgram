package newJavaProgram.tcs;

import java.util.TreeMap;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,33,3,3,3,3,3,45,6,7,5,5,4,4,5,55,66,66};
        int n = arr.length;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
}
