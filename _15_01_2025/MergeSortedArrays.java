import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MergeSortedArrays {

    private static ArrayList<Integer> mergeSortedArray(LinkedList<Integer> arr1, LinkedList<Integer> arr2) {
        ArrayList<Integer> output = new ArrayList<>();

        while (!arr1.isEmpty() && !arr2.isEmpty()) {
            if (arr1.getFirst() < arr2.getFirst()) {
                output.add(arr1.removeFirst());
            } else {
                output.add(arr2.removeFirst());
            }
        }

        while (!arr1.isEmpty()) {
            output.add(arr1.removeFirst());
        }

        while (!arr2.isEmpty()) {
            output.add(arr2.removeFirst());
        }

        return output;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList<Integer> arr1 = new LinkedList<>();
            LinkedList<Integer> arr2 = new LinkedList<>();

            System.out.print("Enter the elements of the first sorted array (space-separated): ");
            String[] input1 = scanner.nextLine().split(" ");
            for (String s : input1) {
                arr1.add(Integer.valueOf(s));
            }

            System.out.print("Enter the elements of the second sorted array (space-separated): ");
            String[] input2 = scanner.nextLine().split(" ");
            for (String s : input2) {
                arr2.add(Integer.valueOf(s));
            }

            ArrayList<Integer> mergedArray = mergeSortedArray(arr1, arr2);

            System.out.println("Merged sorted array: " + mergedArray);
        }
    }
}
