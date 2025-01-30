public class StackImplementation {
    private int top;
    private final int maxSize;
    private final char[] stack;

    public StackImplementation(int size) {
        maxSize = size;
        stack = new char[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(char elem) {
        if (this.isFull()) {
            System.out.println("Stack is full!!");
            return;
        }

        stack[++top] = elem;
        System.out.println("Pushed " + elem + " into the stack.");
    }

    public char pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty");
            return '\0'; // Return null character for empty stack
        }

        char result = stack[top--];
        System.out.println("Popped " + result + " from the stack.");

        return result;
    }

    public char peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty");
            return '\0'; // Return null character for empty stack
        }

        System.out.println("Peeked " + stack[top] + " from the stack.");

        return stack[top];
    }

    public void displayStack() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("[");

        for (int i = 0; i <= top; i++) {
            if (i == top) System.out.print(stack[i]);
            else System.out.print(stack[i] + ", ");
        }

        System.out.println("]");
    }
}