package javaWithKunal.recurrsion;

public class BinarySearchRecurr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,23,34,55,56,76};
        int tar = 343;
        System.out.println(search(arr,tar,0,arr.length-1));
    }
    private static int search(int[] arr,int tar,int st,int en){
        if(st > en) return -1;
        int mid = st + (en-st)/2;
        if(arr[mid] == tar)
            return mid;
        if(arr[mid] > tar)
            return search(arr,tar,st,mid-1);
        return search(arr,tar,mid+1,en);
    }
}
