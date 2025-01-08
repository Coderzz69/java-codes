import java.util.Scanner;

public class Fibonacci {


    static int generateFibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return generateFibonacci(n - 1) + generateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms in the Fibonacci sequence: ");
        n = sc.nextInt();
        
        sc.close();
        // Number of terms in the Fibonacci sequence
        for (int i = 0; i < n; i++) {
            System.out.print(generateFibonacci(i) + " ");
        }
    }

}