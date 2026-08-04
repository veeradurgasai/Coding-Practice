public class addAtanyPos {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add at the end
    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Add at any position (1-based indexing)
    void addAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // Insert at beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        // Move to the node before the desired position
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display the linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        addAtanyPos list = new addAtanyPos();

        list.addLast(10);
        list.addLast(20);
        list.addLast(40);
        list.addLast(50);

        System.out.println("Before Insertion:");
        list.display();

        list.addAtPosition(30, 3);

        System.out.println("After Insertion:");
        list.display();
    }
}