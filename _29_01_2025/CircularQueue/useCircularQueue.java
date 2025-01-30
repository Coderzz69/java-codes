import java.util.Scanner;

public class useCircularQueue {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int size = 0;
        Scanner in = new Scanner(System.in);

        // Input validation for the size of the circular queue
        while (true) {
            System.out.print("Enter the Size of the Circular Queue: ");
            if (in.hasNextInt()) {
                size = in.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Size must be a positive integer. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                in.next(); // Clear the invalid input
            }
        }

        circularQueue circular = new circularQueue(size);

        int choice = 0;

        System.out.print("""
                              Enter (1) to enqueue.
                              Enter (2) to dequeue.
                              Enter (3) to check if queue is empty.
                              Enter (4) to get Rear Element.
                              Enter (5) to get Front Element.
                              Enter (6) to display the queue.
                              Enter (-1) to exit.\n\n""");

        while (choice != -1) {
            System.out.print("Choice: ");
            if (in.hasNextInt()) {
                choice = in.nextInt();
                switch (choice) {
                    case -1 -> System.out.println("Exiting...............");

                    case 1 -> {
                        System.out.print("Enter the Element to enqueue: ");
                        if (in.hasNextInt()) {
                            int element = in.nextInt();
                            circular.enqueue(element);
                        } else {
                            System.out.println("Invalid input. Please enter an integer.");
                            in.next(); // Clear the invalid input
                        }
                    }

                    case 2 -> {
                        int dequeuedElement = circular.dequeue();
                        if (dequeuedElement != -1) { // Assuming -1 indicates an empty queue
                            System.out.println("Dequeued Element: " + dequeuedElement);
                        } else {
                            System.out.println("Queue is empty. Cannot dequeue.");
                        }
                    }

                    case 3 -> {
                        if (circular.isEmpty()) {
                            System.out.println("The queue is empty !!");
                        } else {
                            System.out.println("The queue is not empty !!");
                        }
                    }

                    case 4 -> {
                        int rearElement = circular.getRear();
                        if (rearElement != -1) { // Assuming -1 indicates an empty queue
                            System.out.println("The Rear Element is: " + rearElement);
                        } else {
                            System.out.println("Queue is empty. No rear element.");
                        }
                    }

                    case 5 -> {
                        int frontElement = circular.getFront();
                        if (frontElement != -1) { // Assuming -1 indicates an empty queue
                            System.out.println("The Front Element is: " + frontElement);
                        } else {
                            System.out.println("Queue is empty. No front element.");
                        }
                    }

                    case 6 -> circular.displayQueue();

                    default -> System.out.println("Invalid choice. Please enter a valid option.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                in.next(); // Clear the invalid input
            }
        }

        in.close(); // Close the Scanner object
    }
}