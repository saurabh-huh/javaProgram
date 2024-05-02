package newJavaProgram.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.binarySearch;

public class ReplaceRank {
    public static void main(String[] args) {
        int[] arr1 = {1,4,3,2,6,53,325,45};
        ArrayList<Integer> li = new ArrayList<>();
        int i=0;
        for(int x : arr1)
            li.add(x);
        Collections.sort(li);
        for(i=0;i<arr1.length;i++){
            int ind = Collections.binarySearch(li,arr1[i]);
            arr1[i] = ind+1;
        }
        for(int x : arr1)
            System.out.print(x+" ");
    }
}
