package newJavaProgram.tcs;

public class RotateArrayByNPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int d  =2;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int x : arr)
            System.out.print(x + " ");
    }
    public static void reverse(int[] arr,int st,int en){
        while(st<en){
            int temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;
            st++;
            en--;
        }
    }
}
