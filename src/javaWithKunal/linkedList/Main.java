package javaWithKunal.linkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(45);
        list.insertFirst(54);
        list.insertLast(67);
        list.insert(34,4);
        list.insert(23,5);
        list.display();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
        System.out.println(list.delete(3));
        list.display();
    }
}
