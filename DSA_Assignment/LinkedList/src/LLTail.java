public class LLTail {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addToBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteByValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            if (head == tail) tail = null;
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            if (current.next == tail) tail = current;
            current.next = current.next.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LLTail list = new LLTail();
        list.addToEnd(10);
        list.addToEnd(20);
        list.addToBeginning(5);
        list.addToEnd(30);
        list.display();
        list.deleteByValue(20);
        list.display();
    }
}
