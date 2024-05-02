package javaWithKunal.sorting;


import java.util.Arrays;

import static javaWithKunal.sorting.Sorting.swap;

public class CyclicSort {
    public static void main(String[] args) { // Can be use for only when the numbers are given in the range if 1 to n;
        int[] arr = {1,2,3,8,7,6,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr){
        int i=0;

        while(i!= arr.length-1){
            int currInd = arr[i]-1;
            if(arr[currInd] != arr[i])
                swap(arr,currInd,i);
            else i++;
        }
    }
}
