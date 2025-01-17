import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {

    static String reverseWords(String str){
        ArrayList<String> output = new ArrayList<>(Arrays.asList(str.split(" ")));
        String temp;
        String result = "";
        
        for (int i = 0; i < output.size() / 2; i++){
            temp = output.get(i);
            output.set(i, output.get(output.size()-i-1));
            output.set(output.size()-i-1, temp);
        }

        for (String elem : output){
            result += elem + " ";
        }

        return result;
    }
    public static void main(String[] args) {

        String str;

        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the String to Reverse : ");
            str = in.nextLine();
        }

        System.out.println("Reverse String : " + reverseWords(str));
    }
}
