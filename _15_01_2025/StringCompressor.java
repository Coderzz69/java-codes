import java.util.ArrayList;
import java.util.Scanner;

public class StringCompressor {

    static ArrayList<Character> getItems(String text){

        ArrayList<Character> output = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            if(!output.contains(text.charAt(i))) output.add(text.charAt(i));
        }

        return output;
    }

    static ArrayList<Integer> getCounts(String text, ArrayList<Character> Items){
        ArrayList<Integer> output = new ArrayList<>();
        int Count = 0;

        for (char elem : Items){
            for (int i = 0; i < text.length(); i++){
                if (elem == text.charAt(i)) Count++;
            }
            output.add(Count);
            Count = 0;
        }

        return output;
    }

    static String stringCompressor(ArrayList<Integer> Count, ArrayList<Character> Items){

        String text = "";

        for(int i = 0; i < Count.size(); i++){
            int elem1 = Count.get(i);
            char elem2 = Items.get(i);
            text += elem2 + String.valueOf(elem1);
        }

        return text;
    }
    
    public static void main(String[] args){

        String text;

        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the string to compress : ");
            text = in.nextLine();
        }

        text = stringCompressor(getCounts(text, getItems(text)), getItems(text));

        System.out.println(text);
    }
}
