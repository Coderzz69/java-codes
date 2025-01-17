import java.util.Scanner;

class LCMandGCD{

    static int GCD(int a, int b){
        int result = a <= b ? a : b;
        // var = (condition) ? (true) : (false);

        while(true){
            if (a % result == 0 && b % result == 0) break;
            result -= 1;
        }

        return result;
    }

    static int LCM(int a, int b){
        return (a * b) / GCD(a, b);
    } 

    public static void main(String[] args) {
        int a, b;

        try (Scanner in = new Scanner(System.in)){
            System.out.print("Enter the value of (a) : ");
            a = in.nextInt();
            System.out.print("Enter the value of (b) : ");
            b = in.nextInt();
        }

        System.out.printf("LCM AND GCD of (%d,  %d) are (%d, %d).\n", a, b, LCM(a, b), GCD(a, b));
    }
}