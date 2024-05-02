package newJavaProgram.tcs;

import java.util.Arrays;

public class Rearrangement {
    public static void main(String[] args) {
        int[] arr = {12,34,12,35,76,67,87,23};
        int n = arr.length;
        Arrays.sort(arr);
        int l = (n+1)/2 ;
        int r = n-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for(int x : arr)
            System.out.print(x+" ");
    }
}
