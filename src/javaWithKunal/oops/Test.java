package javaWithKunal.oops;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            String str = sc.next();
            Student s = new Student(x,str);
            arr[i] = s;
        }
        for(Student st : arr){
            System.out.println(st.age+" "+st.name);
        }
    }
}
class Student{
    int age;
    String name;
    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
}
