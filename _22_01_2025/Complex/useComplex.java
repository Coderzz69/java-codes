public class useComplex {
    
    public static void main(String[] args) {
        complex c1 = new complex(3, 4);
        complex c2 = new complex(4, 5);
        complex c3;

        c3 = c1.addWith(c2);
        c3.display();

        c3 = c1.subWith(c2);
        c3.display();

        c3 = c1.multWith(c2);
        c3.display();

        c3 = c1.divWith(c2);
        c3.display();
    }
}
