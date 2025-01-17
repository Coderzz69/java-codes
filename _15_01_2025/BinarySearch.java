
import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {


    static int binarySearch(ArrayList<Integer> arr, int target, int left, int right){
        if(left > right) return -1;
        
        int middle = (left + right)/2;

        if (arr.get(middle) == target) return middle;
        else{
            if(arr.get(middle) < target) return binarySearch(arr, target, middle + 1, right);
            else return binarySearch(arr, target, left, middle - 1);
        }
    }
    

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int target;

        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the values of the sorted Array (space-separated) : ");
            String input = in.nextLine();
            String[] nums = input.split(" ");
            for(String elem : nums) arr.add(Integer.valueOf(elem));

            System.out.print("Enter the target to search : ");
            target = in.nextInt();
        }

        System.out.println(binarySearch(arr, target, 0, arr.size() - 1) != -1 ? "Index : " + binarySearch(arr, target, 0, arr.size() - 1): "Target not found in the array.");
        
    }
}
