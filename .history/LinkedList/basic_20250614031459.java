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
    //addatmiddle
    public void addmiddle(int indx,int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;

        }
        Node temp=head;
        int i=0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
    }
    //size of Linkedlist
    public int size(){
        Node temp=head;
        int size=0;
        
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    //removefirst
    public int removefirst(){
        if(head==null){
            System.out.println("null");
            return -1;
        }
        int val=head.data;
        head=head.next;
        return val;
    }
    //removeLast
    public int removelast(){
        if(head==null){
            return -1;
    }
        if(head.next==null){
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        return val;

    }
    //recusrive search
    
    public int recursive(Node head,int key,int){
        if(head==null){
            return -1;
        }
        else if(head.data==key){
            return i;
        }
        recursive(head.next)
        
    public static void main(String[] args) {
        basic ll=new basic();
       ll.addLast(4);
       ll.addLast(5);
        ll.addFirst(2);
        ll.addFirst(1);
        
        ll.addmiddle(2,3);
        ll.print();
        System.out.println();
        System.out.print(ll.size());
        System.out.println(ll.removefirst());
        ll.removelast();
        ll.print();

        
    }
}