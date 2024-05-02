package javaWithKunal.recurrsion;

import java.util.Arrays;

public class FiboNum {
    public static void main(String[] args) {
        int n = 50;
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibonum(n,dp));
    }
    private static long fibonum(int n,long[] dp){
        if(n==0)
            return dp[0]=0;
        if(n==1)
            return dp[1] = 1;
        if(dp[n] != -1)
            return dp[n];
        return dp[n] = (fibonum(n-1,dp) + fibonum(n-2,dp));
    }
}
