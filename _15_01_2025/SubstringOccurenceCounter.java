import java.util.ArrayList;
import java.util.Scanner;

class SubstringOccurenceCounter{

    
    static ArrayList<Integer> substringOccurenceCounter(String text, String subtext) {
        ArrayList<Integer> output = new ArrayList<>();

        int e;
        int index;
        
        for(int i = 0; i < text.length(); i++){

            index = i;
            e = 0;

            while (text.charAt(i) == subtext.charAt(e)){

                i++;
                e++;

                if (e+1 == subtext.length()){
                    output.add(index+1);
                    break;
                }
            }
        }

        return output;
    }
    public static void main(String[] args) {
        String text, subtext;

        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the superString : ");
            text = in.nextLine();
            System.out.print("Enter the subString : ");
            subtext = in.nextLine();
        }

        ArrayList<Integer> nums = substringOccurenceCounter(text, subtext);

        if (nums.isEmpty()){
            System.out.println("error");
            
        }else{
            System.out.print("Found at Index : ");

            for (int elem : nums){
                System.out.print(elem + " ");
            }
        }
    }
}