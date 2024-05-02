package newJavaProgram;

import java.util.Scanner;

public class FiboNumber {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b =1;
        int cnt =2;
        while(cnt <= n ){
            int temp = b;
            b = a + b;
            a = temp;
            cnt++;
        }
        System.out.println(b);
    }
}
