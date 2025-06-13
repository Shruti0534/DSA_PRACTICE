public class basic{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        basic ll=new basic();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
    }
}