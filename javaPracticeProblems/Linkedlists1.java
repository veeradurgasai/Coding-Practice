class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        
    }
}


class Linkedlists1{
    public static void main(String args[]){
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);


        head.next=first;
        first.next=second;
        Node temp = head;
        while(temp!=null){
            
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

}