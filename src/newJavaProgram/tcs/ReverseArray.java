package newJavaProgram.tcs;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int l=0;
        int r = arr.length-1;
        while(l<r){
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            l++;
            r--;
        }
        for(int x : arr)
            System.out.print(x+" ");
    }
}
