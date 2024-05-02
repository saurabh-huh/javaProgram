package newJavaProgram;

import java.util.Scanner;

public class StringMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "AsKcDE";
        String str2 = "ASDE";
        System.out.println(solve(str1,str2));
    }
    private static boolean solve(String str1,String str2){
        if(str1.length() < str2.length())
            return false;
        int i =0;
        int j =0;
        while(j < str2.length()){
            if(str1.charAt(i) >= 65 && str1.charAt(i) <= 90 && str1.charAt(i) != str2.charAt(j))
                return false;
            if(str1.charAt(i) == str2.charAt(j) || (str1.charAt(i)^' ') == str2.charAt(j)){
                i++;j++;
            } else
                i++;
            if(i==str1.length() && j != str2.length()) return false;
        }
        while(i < str1.length()){
            if(str1.charAt(i) >= 65 && str1.charAt(i) <= 90 )
                return false;
            i++;
        }
        return true;
    }
}
