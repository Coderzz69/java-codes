import java.util.Scanner;

class Squares_Cubes{

    static void generateSquareCubeTable(int n){

        System.out.println("n_Val\tSquare\tCubes");

        for (int i = 1; i <= n; i++){
            System.out.println(i + "\t" + i*i + "\t" + i*i*i);
        }

    }
    public static void main(String[] args){

        int n;

        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the value : ");
            n = in.nextInt();
        }

        generateSquareCubeTable(n);
    }
}