import java.util.Scanner;

public class useStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("Enter the size of the stack : ");
        while (true) {
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.print("Size must be a positive integer. Please enter again: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a positive integer: ");
                scanner.next(); // clear the invalid input
            }
        }

        StackImplementation stack = new StackImplementation(size);

        System.out.println("Choose an option:");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Display");
        System.out.println("5. isFull");
        System.out.println("6. isEmpty");
        System.out.println("7. Exit\n");

        while (true) {
            System.out.println("Choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value to push:");
                    char value = scanner.next().charAt(0);
                    stack.push(value);
                    System.out.println("\n");
                }
                case 2 -> stack.pop();
                case 3 -> stack.peek();
                case 4 -> stack.displayStack();
                case 5 -> {
                    if (stack.isFull()) {
                        System.out.println("Stack is Full!!");
                    } else {
                        System.out.println("Stack is not Full!!");
                    }
                }
                case 6 -> {
                    if (stack.isEmpty()) {
                        System.out.println("Stack is Empty!!");
                    } else {
                        System.out.println("Stack is not Empty!!");
                    }
                }
                case 7 -> {
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}
