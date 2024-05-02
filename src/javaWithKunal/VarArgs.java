package javaWithKunal;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,5);

    }
    static  void fun(int ...v){
//        System.out.println(Arrays.toString(v));
        String str = Arrays.toString(v);
        System.out.println(str);
        System.out.println(str.length());
        for(int i=0;i<str.length();i++){

            System.out.println(str.charAt(i));
        }
    }
}
