import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRotation {



        static ArrayList<Integer> arrayRotation(ArrayList<Integer> arr, int k){

            ArrayList<Integer> output = new ArrayList<>();

            for (int i = 0; i < arr.size(); i++){
                output.add(arr.get((i + k) < arr.size() ? (i + k) : (i + k - arr.size())));
            }

            return output;
        }


        public static void main(String[] args) {

            ArrayList<Integer> arr = new ArrayList<>();
            int k;

            try (Scanner in = new Scanner(System.in)) {
                System.out.print("Enter the values into Array (space-separated): ");
                String[] input = in.nextLine().split(" ");
                for (String s : input) {
                    arr.add(Integer.valueOf(s));
                }
            
                System.out.print("Enter the value of k: ");
                k = in.nextInt();
            }

            ArrayList<Integer> rotatedArray = arrayRotation(arr, k);
            System.out.println("Rotated Array : " + rotatedArray);        
        }
}
