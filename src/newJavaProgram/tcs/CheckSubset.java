package newJavaProgram.tcs;

import java.util.HashSet;

public class CheckSubset {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int[] arr1 = {1,3,2};
        int[] arr2 = {1,4,2,5,3};
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr2) set.add(x);
        for(int i=0;i<n;i++){
            if(!set.contains(arr1[i]))
                System.out.println("No");
        }
        System.out.println("Yes");
    }
}
