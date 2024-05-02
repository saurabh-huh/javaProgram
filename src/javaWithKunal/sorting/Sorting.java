package javaWithKunal.sorting;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,6,32,3,2,35,62,21,22};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
                else break;
            }
        }
    }

    private static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxInd = getMaxInd(arr,0,last);
            swap(arr,maxInd,last);
        }
    }

    private static int getMaxInd(int[] arr, int st, int end) {
        int max  =st;
        for (int i = st; i <=end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j = 1; j < arr.length-i-1; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[] arr, int st, int en){
        int temp = arr[st];
        arr[st] = arr[en];
        arr[en] = temp;
    }
}
