import java.util.Scanner;

public class useParanthesisChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string to check for balanced parentheses:");
            String input = scanner.nextLine();
            
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Input cannot be null or empty.");
            } else {
                paranthesisChecker checker = new paranthesisChecker(input);
                
                if (checker.isParanthesisRight()) {
                    System.out.println("The parentheses are balanced.");
                } else {
                    System.out.println("The parentheses are not balanced.");
                }
            }
        }
    }
}