public class straightLine{
    double a, b, c; // For ax + by + c;

    public straightLine(double A){
        a = A;
        b = 0;
        c = 0;
    }

    public straightLine(double A, double B){
        a = A;
        b = B;
        c = 0;
    }

    public straightLine(double A, double B, double C){
        a = A;
        b = B;
        c = C;
    }

    public int isParallelWith(straightLine l){
        if ((this.a/l.a) == (this.b/l.b)) return 1;
        else return 0;
    }

    public int isPerpendicularWith(straightLine l){
        if((-this.a/this.b) * (-l.a/l.b) == -1) return 1;
        else return 0;
    }

    public int isPointOnLine(double x, double y){
        if (this.a * x + this.b * y + c == 0) return 1;
        else return 0;
    }

    public void display(int n){
        System.out.println("Line " + n + " : " + a + " x + " + b + " y + " + c);
    }
    
}