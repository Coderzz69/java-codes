import java.util.Scanner;

public class BinaryDecimal {

    static void binaryToDecimal(long num)
    {
        long decimal = 0;
        long mul = 1;
        while(num>0)
        {
            decimal = decimal + mul*(num%10);
            mul = mul*2;
            num = num/10;
        }
        System.out.println("Decimal : "+decimal);
    }
    public static void main(String[] args)
    {
        long num;

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter binary number : ");
            num = sc.nextInt();
        }

        binaryToDecimal(num);
    }
}
