public class MyLinkedList {
    
    Node head;

    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node toAdd = new Node(data);

        if(isEmpty()) {
            head = toAdd;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
