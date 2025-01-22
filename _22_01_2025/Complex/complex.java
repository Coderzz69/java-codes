public class complex {
    double a, b;

    public complex() {
        a = 1.0;
        b = 1.0;
    }

    public complex(double c) {
        a = c;
        b = 0.0;
    }

    public complex(double c, double d) {
        a = c;
        b = d;
    }

    public complex(complex c) {
        a = c.a;
        b = c.b;
    }

    public complex addWith(complex c) {
        return new complex(this.a + c.a, this.b + c.b);
    }

    public complex subWith(complex c) {
        return new complex(this.a - c.a, this.b - c.b);
    }

    public complex multWith(complex c) {
        return new complex(this.a * c.a - this.b * c.b, this.a * c.b + this.b * c.a);
    }

    public complex divWith(complex c) {
        return new complex((this.a * c.a + this.b * c.b) / (c.a * c.a + c.b * c.b), (this.b * c.a - this.a * c.b) / (c.a * c.a + c.b * c.b));
    }

    public void display() {
        if (this.b > 0) {
            System.out.println("Complex : " + this.a + " + i" + this.b);
        } else if (this.b == 0) {
            System.out.println("Complex : " + this.a);
        } else {
            System.out.println("Complex : " + this.a + " - i" + (-this.b));
        }
    }
}