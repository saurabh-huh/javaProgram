package newJavaProgram;

import java.util.Scanner;

public class XorBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();   //ICOCICIAOBI
        if(str.length() == 0) System.out.println("-1");
        int ans = str.charAt(0) - 48;
        for(int i=1;i<str.length()-1;i+=2){
            if(str.charAt(i) == 'C'){
                ans = ans ^ (str.charAt(i+1) - 48);
            }
            else if(str.charAt(i) == 'A'){
                ans = ans & (str.charAt(i+1) - 48);
            }
           else if(str.charAt(i) == 'B'){
                ans = ans | (str.charAt(i+1) - 48);
            }
        }
        System.out.println(ans);
    }
}
