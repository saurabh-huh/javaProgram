package newJavaProgram;

import java.util.Scanner;

public class RemCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        String str = "";
        String code = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while(num>0){
            int rem = num%n;
            num = num/n;
            str = String.valueOf(code.charAt(rem)) + str;
        }
        System.out.println(str);
    }
}
