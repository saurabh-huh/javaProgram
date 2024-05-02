package javaWithKunal;

public class Shadowing {
    static int x = 13;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 34000;
        System.out.println(x);
    }
}
