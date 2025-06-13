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
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //addLast
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //print
    public void print(){
        Node temp=head;
        if(head==null){
            System.out.println("Null");
            return;
        }
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    //
    public static void main(String[] args) {
        basic ll=new basic();
       ll.addLast(1);
       ll.addLast(2);
        ll.addFirst(0);
        ll.addFirst(5);
        ll.addLast(8);
        ll.print();
        
    }
}