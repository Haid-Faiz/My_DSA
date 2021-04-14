public class Practice {
    public static void main(String[] args) {
        // I am just practicing my DSA

        // MyLinkedList singlyList = new MyLinkedList();
        MyDoublyLinkedList doublyList = new MyDoublyLinkedList();

        doublyList.add(5);
        doublyList.add(4);
        doublyList.add(8);

        doublyList.delete(2);
        doublyList.print();
    }
}
