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
    //addFirst
    public static void addFirst(int data){
        Node newNode=new Node(data);
        
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void main(String[] args) {
        basic ll=new basic();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.addFirst(0);
        ll.addFir
    }
}