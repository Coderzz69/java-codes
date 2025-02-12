public class Stack {
    private final String[] elements;      // Array to store stack elements
    private int currentTop;               // Tracks current position

    Stack(int capacity) {
        elements = new String[capacity];
        currentTop = -1;
    }

    boolean isFull() {
        return currentTop >= elements.length - 1;
    }

    boolean isEmpty() {
        return currentTop < 0;
    }

    void push(String data) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        elements[++currentTop] = data;
    }

    String pop() {
        if (isEmpty()) {
            return null;
        }
        return elements[currentTop--];
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return elements[currentTop];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return;
        }
        
        System.out.print("Expression Result: ");
        for (int index = 0; index <= currentTop; index++) {
            System.out.print(elements[index]);
        }
        System.out.println();
    }
}