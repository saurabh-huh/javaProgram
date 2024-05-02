package newJavaProgram;

import java.util.Scanner;

public class stringChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' '){
                ans += " ";
            } else {
                ans += (char) (ch ^ ' ');
            }
        }

        for(int i=0;i<str.length();i++){
            if(ans.charAt(i) == ' ')
                System.out.println();
            else
                System.out.print(ans.charAt(i));
        }
    }
}
