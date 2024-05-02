package newJavaProgram;

import java.util.Scanner;

public class SwapTwoNumber { // swap two numbers using function.
    int a,b;
    public static void main(String[] args) {
        SwapTwoNumber sn = new SwapTwoNumber();
        Scanner sc = new Scanner(System.in);
        sn.a = sc.nextInt();
        sn.b = sc.nextInt();
        SwapTwoNumber.swap(sn);
        System.out.println(sn.a+" "+sn.b);
    }
    static void swap(SwapTwoNumber sn){
        int temp = sn.a;
        sn.a = sn.b;
        sn.b = temp;
    }

}
