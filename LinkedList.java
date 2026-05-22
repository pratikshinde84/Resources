class LinkedList{
    Node head=null;
    class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    void addFirst(int val){
        if(head==null){
            head=new Node(val);
            head.next=null;
            return;
        }
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
    }
    void addLast(int val){
        if(head==null){
            head=new Node(val);
            head.next=null;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(val);
        temp.next=newNode;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.print();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.print();
    }
}