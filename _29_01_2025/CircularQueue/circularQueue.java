public class circularQueue {

    private final int maxSize;
    private int front, rear;
    private final int[] queue;

    public circularQueue(int size) {
        maxSize = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public int getFront() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        }
        return queue[front];
    }

    public int getRear() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        }
        return queue[rear];
    }

    public void enqueue(int elem) {
        if (isFull()) {
            System.out.println("Queue is Full!!");
            return;
        }

        if (this.isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % maxSize;
        }

        queue[rear] = elem;
        System.out.println("Enqueued: " + elem + " at index: " + rear);
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        }

        int result = queue[front];
        System.out.println("Dequeued: " + result + " from index: " + front);

        if (front == rear) {
            // Reset front and rear when the queue becomes empty
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % maxSize;
        }

        return result;
    }

    public void displayQueue() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty!!");
            return;
        }

        System.out.print("[");
        int temp = front;
        while (true) {
            System.out.print(queue[temp]);
            if (temp == rear) {
                break;
            }
            System.out.print(", ");
            temp = (temp + 1) % maxSize;
        }
        System.out.println("]\n");
    }
}