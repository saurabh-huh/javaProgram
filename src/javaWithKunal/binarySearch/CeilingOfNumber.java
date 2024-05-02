package javaWithKunal.binarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9,19};
        int tar = 9;
        System.out.println(ceilingOfNumber(arr,tar));
    }
    private static int ceilingOfNumber(int[] arr,int tar){
        int st = 0;
        int en = arr.length -1;

        while(st <= en){
            int mid = st + (en-st)/2;
            if(arr[mid] > tar){
                en = mid-1;
            } else if(arr[mid] < tar){
                st = mid+1;
            }
            else
                return mid;
        }
        return st;
    }
}
