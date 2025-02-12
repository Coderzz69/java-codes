import java.util.Scanner;

public class useQueueSLL {
    public static void main(String[] args) {
        queueSLL queue = new queueSLL();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;

            System.out.println("Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty()");
            System.out.println("5. Display");
            System.out.println("6. Exit\n");
            
            while (choice != 6) {
                
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter value to enqueue: ");
                        int value = scanner.nextInt();
                        
                        queue.enqueue(value);
                    }
                    case 2 -> {
                        int dequeuedValue = queue.dequeue();
                        if (dequeuedValue != -1) {
                            System.out.println("Dequeued value: " + dequeuedValue);
                        }
                    }
                    case 5 -> queue.display();
                    case 4 -> System.out.println(queue.isEmpty() ? "Queue is Empty !!" : "Queue is NOT Empty !!");
                    case 3 -> {
                        int peekValue = queue.peek();
                        if (peekValue != -1) {
                            System.out.println("Front value: " + peekValue);
                        }
                    }
                    case 6 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        }

    }
}