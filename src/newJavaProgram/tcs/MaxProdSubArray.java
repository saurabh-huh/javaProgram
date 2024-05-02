package newJavaProgram.tcs;

public class MaxProdSubArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,2,-23,0,4,23,-2};
        int n = arr.length;
        int pre =1;
        int suf =1;
        int maxprod = 1;
        for(int i=0;i<n;i++){
            if(pre == 0) pre =1;
            if(suf == 0) suf =1;
            pre *= arr[i];
            suf *= arr[n-i-1];
            maxprod = Math.max(maxprod,Math.max(pre,suf));
        }
        System.out.println(maxprod);
    }
}
