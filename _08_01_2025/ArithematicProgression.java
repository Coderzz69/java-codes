import java.util.Scanner;

class ArithematicProgression{

    static void generateAP(int a, int d, int n){
        int out = a;

        for (int i = 0; i < n; i++){
            
            System.out.print(out + " ");
            out += d;
        }

    }
    public static void main(String[] args) {

        int a, d, n;
        
        try(Scanner in = new Scanner(System.in)){
            a = in.nextInt();
            d = in.nextInt();
            n = in.nextInt();
        }

        generateAP(a, d, n);

    }
}