import java.util.Scanner;

public class useStraightLine {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter coefficients for the first line (a1, b1, c1): ");
            int a1 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int c1 = scanner.nextInt();
            straightLine l1 = new straightLine(a1, b1, c1);
            
            System.out.println("Enter coefficients for the second line (a2, b2, c2): ");
            int a2 = scanner.nextInt();
            int b2 = scanner.nextInt();
            int c2 = scanner.nextInt();
            straightLine l2 = new straightLine(a2, b2, c2);
            
            l1.display(1);
            l2.display(2);
            
            if (l1.isParallelWith(l2) == 1) System.out.println("Line 1 is parallel to Line 2.");
            else System.out.println("Line 1 is not parallel to Line 2.");
            
            if (l1.isPerpendicularWith(l2) == 1) System.out.println("Line 1 is perpendicular to Line 2.");
            else System.out.println("Line 1 is not perpendicular to Line 2.");
            
            System.out.println("Enter a point (x, y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            if (l1.isPointOnLine(x, y) == 1) System.out.println("Point (" + x + ", " + y + ") is on the Line.");
            else System.out.println("Point (" + x + ", " + y + ") is not on the Line.");
        }
    }
}
