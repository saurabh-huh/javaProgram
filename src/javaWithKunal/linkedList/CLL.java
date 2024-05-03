package javaWithKunal.linkedList;

public class CLL {

    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        if(head == null)
            return;
        Node node = head;
        if(node.val == val){
            tail.next = head.next;
            head = head.next;
            return;
        }
        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                System.out.println(tail.val);
                break;
            }
            node = node.next;
        } while(node != head);

    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val+" -> ");
                node = node.next;
            }while(node!=head);
            System.out.println("head");
        }
    }

    private class Node {
        int val;
        Node next;

        public Node(int val){
            this .val = val;
        }
    }
}
