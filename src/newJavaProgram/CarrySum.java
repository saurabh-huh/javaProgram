package newJavaProgram;

import java.util.Scanner;

public class CarrySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int carry=0;
        int cnt = 0;
        while(num1>0 || num2 >0){
            int rem1 = num1%10;
            int rem2 = num2%10;

            num1 = num1/10;
            num2 = num2/10;


            if(rem1 + rem2 + carry > 9){
                carry = 1;
            } else carry =0;
            cnt += carry;
        }
        System.out.println(cnt);
    }
}
