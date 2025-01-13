public class QueueArray {
    private int front, rear, size;
    private int[] queue;

    public QueueArray(int capacity) {
        size = capacity;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = data;
        }
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = queue[front];
        front++;
        return value;
    }

    public int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        System.out.println("Front Element: " + queue.peek());
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}
