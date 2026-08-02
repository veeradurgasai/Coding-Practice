public class deletePositionSll {

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

    // Add node at the end
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

    // Delete node at a given position (1-based indexing)
    void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        // Delete first node
        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Move to the node before the position
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }

        // Delete the node
        temp.next = temp.next.next;
    }

    // Display linked list
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

        deletePositionSll list = new deletePositionSll();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println("Before Deletion:");
        list.display();

        list.deleteAtPosition(3);

        System.out.println("After Deletion:");
        list.display();
    }
}