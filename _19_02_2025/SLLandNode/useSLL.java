import java.util.Scanner;

public class useSLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice, data;

            System.out.println("\nMenu:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete at Beginning");
            System.out.println("4. Delete by Value");
            System.out.println("5. Get Sum");
            System.out.println("6. Display");
            System.out.println("7. Exit\n");

            do {
                
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter data to insert at beginning: ");
                        data = scanner.nextInt();
                        list.insertAtBeginning(data);
                    }
                    case 2 -> {
                        System.out.print("Enter data to insert at end: ");
                        data = scanner.nextInt();
                        list.insertAtEnd(data);
                    }
                    case 3 -> {
                        data = list.deleteAtBeginning();
                        if (data != -1) {
                            System.out.println("Deleted data: " + data);
                        }
                    }
                    case 4 -> {
                        System.out.print("Enter value to delete: ");
                        data = scanner.nextInt();
                        list.deleteByValue(data);
                    }
                    case 5 -> System.out.println("Sum: " + list.getSum());
                    case 6 -> list.display();
                    case 7 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 8);
        }
    }
}
