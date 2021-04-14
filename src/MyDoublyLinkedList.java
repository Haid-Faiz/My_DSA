public class MyDoublyLinkedList {


    private Node head;

    public void add(int data) {
        Node toAdd = new Node(data);

        if(isEmpty())
            head = toAdd;
         else {
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = toAdd;
            toAdd.previous = temp;
        }
    }

    public void delete(int index) {
        Node temp = head;
        for(int i=0; i<index-1; i++) {
            temp = temp.next;
        }
        temp.next.next.previous = temp;
        temp.next = temp.next.next;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private boolean isEmpty() {
        return head == null;
    }





    private class Node {
        private int data;
        private Node next;
        private Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

}
