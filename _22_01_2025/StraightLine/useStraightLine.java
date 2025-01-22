public class useStraightLine {
    public static void main(String[] args) {
        straightLine l1 = new straightLine(2, 3, 4);
        straightLine l2 = new straightLine(4, 6, 8);

        l1.display(1);
        l2.display(2);

        if (l1.isParallelWith(l2) == 1) System.out.println("Line 1 is parallel to Line 2.");
        else System.out.println("Line 1 is parallel to Line 2.");

        if (l1.isPerpendicularWith(l2) == 1) System.out.println("Line 1 is perpendicular to Line 2.");
        else System.out.println("Line 1 is perpendicular to Line 2.");

        int x = -2, y = 0;

        if (l1.isPointOnLine(x, y) == 1) System.out.println("Point (" + x + ", " + y + ") is on the Line.");
        else System.out.println("Point (" + x + ", " + y + ") is not on the Line.");
    }
}
