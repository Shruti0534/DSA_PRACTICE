//pallindrome
    public Node findmid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
            
            
        }
    public boolean pallindrome(){
        //find midnode
        Node mid=findmid(head);
        //2nd part reverse
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //compare 1st and 2nd part
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left,next;
            right=right.next;
        }
        return true;
        

    }
