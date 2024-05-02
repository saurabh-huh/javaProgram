package newJavaProgram.tcs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class SortByFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,2,2,2,2,2,4,1,1,1,5,5,5,5,5,5,5,5,5,};
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int[][] sorted = new int[map.size()][2];
        int i=0;
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            sorted[i][0] = entry.getValue();
            sorted[i++][1] = entry.getKey();
        }
        Arrays.sort(sorted, Comparator.comparingInt(a -> a[0]));

        int k=0;
        for(i=map.size()-1;i>=0;i--){
            for(int j=0;j<sorted[i][0];j++){
                arr[k++] = sorted[i][1];
            }
        }

        for(int x : arr)
            System.out.print(x+" ");
    }
}
