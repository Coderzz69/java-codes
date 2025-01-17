import java.util.Scanner;

public class ArmstronNumberChecker {

    static int pow(int a, int b){
        int result = 1;

        for(int i = 0; i < b; i++){
            result *= a;
        }

        return result;
    }
    
    static boolean isArmstrongNumber(int n){
        int num = n;
        int count = 0;
        int sum = 0;

        while (num != 0){
            count++;
            num /= 10;
        }

        num = n;

        while(num != 0){
            sum += pow(num%10, count);
            num /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int n;
        
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the number to check for Armstrong : ");
            n = in.nextInt();
        }

        System.out.println(isArmstrongNumber(n) ? "Armstrong Number" : "NOT Armstrong Number");


    }
}
