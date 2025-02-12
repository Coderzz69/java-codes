public class queueSLL {

    public class Node {
        public int data;
        public Node next;

        
        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node front, rear;
    int size = 0;

    public queueSLL(int data){
        Node temp = new Node(data);
        front = temp;
        rear = temp;
    }

    public queueSLL() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        if (size == 0) {
            Node temp = new Node(data);
            front = temp;
            rear = temp;
        } else {
            Node temp = new Node(data);
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public int dequeue() {
        switch (size) {
            case 0 -> {
                System.out.println("The queue is empty!!");
                return -1;
            }
            case 1 -> {
                int data = front.data;
                front = null;
                size--;
                return data;
                
            }
            default -> {
                int data = front.data;
                front = front.next;
                size--;
                return data;
                
            }
        }
    }

    public int peek() {
        if (size == 0) {
            System.out.println("The queue is empty!!");
            return -1;
        }else return front.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (size == 0) {
            System.out.println("The queue is empty!!");
            return;
        }

        Node tmp = front;

        if (front == rear && front != null && rear != null) {
            System.out.println("[" + front.data + "]");
            return;
        }

        System.out.print("[");

        while (tmp != rear && tmp != null) { 
            System.out.print(tmp.data + ", ");
            tmp = tmp.next;
        }

        System.out.println(rear.data + "]");
    }
}