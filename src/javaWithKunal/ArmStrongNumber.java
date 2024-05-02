package javaWithKunal;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dig = 0;
        int m = n;

        while(m>0){
            m /= 10;
            dig++;
        }
        boolean ans = checkNum(n,dig);
        System.out.println(ans);
    }
    static boolean checkNum(int n , int dig){
        int sum = 0;
        int m = n;
        while(n>0){
            int rem = n%10;
            n /= 10;
            sum += (int)(Math.pow(rem,dig));
        }
        return sum == m;
    }
}
