public class SLL {
    Node head;

    public SLL() {
        head = null;
    }

    public SLL(int data) {
        Node tmp = new Node(data);
        head = tmp;
    }

    public void insertAtBeginning(int data) {
        if (head == null) { 
            Node tmp = new Node(data);
            head = tmp;
        } else {
            Node tmp = new Node(data);
            tmp.next = head;
            head = tmp;
        }
    }

    public int deleteAtBeginning() {
        if(head == null){
            System.out.println("Linked Linked is empty!!");
            return -1;
        } else {
            int data = head.data;

            head = head.next;

            return data;
        }
    }

    public void insertAtEnd(int data) {
        if(head == null) {
            head = new Node(data);
        } else {
            Node tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }

            tmp.next = new Node(data);
        }
    }

    public void deleteByValue(int val) {
        if(head == null) {
            System.out.println("Linked Linked is empty!!");
            return;
        }

        int count = 0;

        Node tmp = head;

        while(tmp != null) {
            if(tmp.data == val) {
                if(tmp == head) {
                    head = head.next;
                    count++;
                } else {
                    Node prev = head;
                    while(prev.next != tmp) {
                        prev = prev.next;
                    }
                    prev.next = tmp.next;
                    count++;
                }
                System.out.println("Deleted " + count + " instances !!");
                return;
            }
            tmp = tmp.next;
        }
    }

    public int getSum() {
        int sum = 0;

        Node tmp = head;

        while(tmp != null) {
            sum += tmp.data;
            tmp = tmp.next;
        }

        return sum;
    }

    public void display() {
        if (head == null) {
            System.out.println("The queue is empty!!");
            return;
        }

        Node tmp = head;

        if (tmp.next == null) {
            System.out.println("[" + tmp.data + "]");
            return;
        }

        System.out.print("[");

        while (tmp.next != null) { 
            System.out.print(tmp.data + ", ");
            tmp = tmp.next;
        }

        System.out.println(tmp.data + "]");
    }

}
