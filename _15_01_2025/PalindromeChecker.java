import java.util.Scanner;

public class PalindromeChecker {

    static String removeSpaces(String text){

        String output[] = text.split(" ");

        text = "";

        for (String elem : output){
            text += elem;
        }

        return text;
    }


    static boolean palindromeChecker(String text){

        text = text.toLowerCase();
        text = removeSpaces(text);


        for(int i = 0; i < text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        String testString;

        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the String to check for Palindrome : ");
            testString = in.nextLine();
        }

        System.out.println((palindromeChecker(testString) ? "Palindrome." : "NOT a Palindrome."));

    }
}
