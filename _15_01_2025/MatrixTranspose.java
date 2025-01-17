import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
    public static int[][] matrixTranspose(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        
        try(Scanner in = new Scanner(System.in)){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    System.out.print("Enter [" + i + ", " + j + "] : ");
                    matrix[i][j] = in.nextInt();
                }
            }
        }

        matrix = matrixTranspose(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }
}
