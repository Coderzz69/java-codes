public class SLL {
    Node head;

    public SLL() {
        head = null;
    }

    public SLL(int data) {
        head = new Node(data);
    }

    public void insertAtBeginning(int data) {
        head = insertAtBeginningRecursive(head, data);
    }

    private Node insertAtBeginningRecursive(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        Node newNode = new Node(data);
        newNode.next = node;
        return newNode;
    }

    public int deleteAtBeginning() {
        if (head == null) {
            System.out.println("Linked List is empty!!");
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public void insertAtEnd(int data) {
        head = insertAtEndRecursive(head, data);
    }

    private Node insertAtEndRecursive(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        node.next = insertAtEndRecursive(node.next, data);
        return node;
    }

    public void deleteByValue(int val) {
        head = deleteByValueRecursive(head, val);
    }

    private Node deleteByValueRecursive(Node node, int val) {
        if (node == null) {
            System.out.println("Linked List is empty!!");
            return null;
        }
        if (node.data == val) {
            return node.next;
        }
        node.next = deleteByValueRecursive(node.next, val);
        return node;
    }

    public int getSum() {
        return getSumRecursive(head);
    }

    private int getSumRecursive(Node node) {
        if (node == null) {
            return 0;
        }
        return node.data + getSumRecursive(node.next);
    }

    public void display() {
        System.out.print("[");
        displayRecursive(head);
        System.out.println("]");
    }

    private void displayRecursive(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data);
        if (node.next != null) {
            System.out.print(", ");
        }
        displayRecursive(node.next);
    }
}
