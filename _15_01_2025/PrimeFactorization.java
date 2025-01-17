import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {

    static ArrayList<Integer> primeFactorization(int n){
        ArrayList<Integer> output = new ArrayList<>();

        while (n % 2 == 0){
            output.add(2);
            n /= 2;
        }

        for (int j = 0; j < 5; j++){
            for (int i = 3; i < n; i += 2){
                if (n % i == 0){
                    output.add(i);
                    n /= i;
                }
            }
        }

        if (n > 1) output.add(n);

        output.sort(null);

        return output;
    }
    public static void main(String[] args){

        int n;
        System.out.print("Enter the value of n: ");

        try(Scanner in = new Scanner(System.in)){
            n = in.nextInt();
        }

        ArrayList<Integer> output = primeFactorization(n);

        System.out.println(output);

    }
}
