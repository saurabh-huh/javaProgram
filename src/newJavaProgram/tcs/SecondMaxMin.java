package newJavaProgram.tcs;

import java.util.Scanner;

public class SecondMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int snum = Integer.MAX_VALUE;
        int mnum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > mnum)
                mnum = arr[i];
            if(arr[i] < snum)
                snum = arr[i];
        }
        int snum1 = Integer.MAX_VALUE;
        int mnum1 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > mnum1 && arr[i] != mnum)
                mnum1 = arr[i];
            if(arr[i] < snum1 && arr[i] != snum)
                snum1 = arr[i];
        }
        System.out.println(snum1 +" "+mnum1);
    }
}
