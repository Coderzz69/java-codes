import java.util.ArrayList;
import java.util.Scanner;

public class MarkAnalysis {

    private static double getAvg(ArrayList<Integer> marks){
        int sum = 0;

        for (int elem : marks){
            sum += elem;
        }

        double avg = (double) sum/marks.size(); 

        return avg;
    }

    private static double getMax(ArrayList<Integer> marks){
        double max = 0;

        for (int elem : marks){
            if (max < (double)elem) max = (double)elem;
        }

        return max;
    }

    private static double getMin(ArrayList<Integer> marks){
        double min = getMax(marks);

        for (int elem : marks){
            if (min > (double)elem) min = (double)elem;
        }

        return min;
    }

    static ArrayList<Double> markAnalysis(ArrayList<Integer> marks){


        ArrayList<Double> output = new ArrayList<>();

        output.add(getMax(marks));
        output.add(getMin(marks));
        output.add(getAvg(marks));

        return output;
    }

    public static void main(String[] args) {

        System.out.println("Enter the Marks followed by '-1' to exit : ");
        ArrayList<Integer> marks = new ArrayList<>  ();


        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                int input = in.nextInt();
                if (input == -1) {
                    break;
                }
                marks.add(input);
            }
        }

        ArrayList<Double> output = markAnalysis(marks);

        System.out.println("Maximum : " + output.get(0));
        System.out.println("Minimum : " + output.get(1));
        System.out.println("Average : " + output.get(2));
        
    }

}
