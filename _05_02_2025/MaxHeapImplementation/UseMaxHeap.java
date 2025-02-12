import java.util.Arrays;
import java.util.Scanner;

public class UseMaxHeap {
    
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            MaxHeap maxHeap = new MaxHeap(10);
            boolean exit = false;
            
            while (!exit) {
                System.out.println("Menu:");
                System.out.println("1. Insert element");
                System.out.println("2. Display heap");
                System.out.println("3. Extract max");
                System.out.println("4. Heap sort");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter element to insert: ");
                        int element = scanner.nextInt();
                        maxHeap.insert(element);
                    }

                    case 2 -> maxHeap.displayHeap();

                    case 3 -> System.out.println("Deleted : " + maxHeap.extractMax());

                    case 4 -> {
                        System.out.println("Enter array size: ");
                        int size = scanner.nextInt();
                        int[] array = new int[size];
                        System.out.println("Enter array elements: ");
                        for (int i = 0; i < size; i++) {
                            array[i] = scanner.nextInt();
                        }
                        MaxHeap.heapSort(array);
                        System.out.println("Array after heap sort:");
                        System.out.println(Arrays.toString(array));
                    }

                    case 5 -> exit = true;
                    
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}