package newJavaProgram;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch1 = sc.next().trim().charAt(0);
        char ch2 = sc.next().trim().charAt(0);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch1)
                str = str.substring(0,i) + ch2 + str.substring(i+1);
            else if(str.charAt(i) == ch2)
                str = str.substring(0,i) + ch1 + str.substring(i+1);

        }
        System.out.println(str);

    }
}
