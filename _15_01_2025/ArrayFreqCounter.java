import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFreqCounter {

    static ArrayList<Integer> getItems(int[] array) {
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!output.contains(array[i])) output.add(array[i]);
        }

        return output;
    }

    static ArrayList<Integer> getCounts(int[] array, ArrayList<Integer> items) {
        ArrayList<Integer> output = new ArrayList<>();
        int count = 0;

        for (int elem : items) {
            for (int i = 0; i < array.length; i++) {
                if (elem == array[i]) count++;
            }
            output.add(count);
            count = 0;
        }

        return output;
    }

    static String arrayCompressor(ArrayList<Integer> count, ArrayList<Integer> items) {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < count.size(); i++) {
            int elem1 = count.get(i);
            int elem2 = items.get(i);
            text.append(elem2).append(":").append(elem1);
            if (i < count.size() - 1) {
                text.append(", ");
            }
        }

        return text.toString();
    }

    public static void main(String[] args) {
        int[] array;

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = in.nextInt();
            array = new int[size];

            System.out.print("Enter the elements of the array (space separated): ");
            for (int i = 0; i < size; i++) {
                array[i] = in.nextInt();
            }
        }

        String compressedArray = arrayCompressor(getCounts(array, getItems(array)), getItems(array));

        System.out.println(compressedArray);
    }
}