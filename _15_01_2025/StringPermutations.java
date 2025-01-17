import java.util.ArrayList;
import java.util.Scanner;

class StringPermutations{

    static ArrayList<String> stringPermutations(String str, String prefix, ArrayList<String> output){
        if (str.length() == 0){
            output.add(prefix);
            return output;
        }else{
            for(int i = 0; i < str.length(); i++){
                String remaining = str.substring(0, i) + str.substring(i + 1);
                stringPermutations(remaining, prefix + str.charAt(i), output);
            }
            return output;
        }
    }

    public static void main(String[] args) {
        String str;

        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the string to be permutated : ");
            str = in.nextLine();
        }

        ArrayList<String> output = new ArrayList<>();
        ArrayList<String> permutations = stringPermutations(str, "", output);
        System.out.println(permutations);

    }

}
