import java.util.Scanner;

public class useComplex {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter real part of first complex number: ");
            double real1 = scanner.nextDouble();
            System.out.print("Enter imaginary part of first complex number: ");
            double imag1 = scanner.nextDouble();
            
            System.out.print("Enter real part of second complex number: ");
            double real2 = scanner.nextDouble();
            System.out.print("Enter imaginary part of second complex number: ");
            double imag2 = scanner.nextDouble();
            
            complex c1 = new complex(real1, imag1);
            complex c2 = new complex(real2, imag2);
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
}
