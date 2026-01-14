package folhas.section_8_75;

import java.util.Locale;
import java.util.Scanner;

public class exercise1_8_75 {
    //atributos
        double width;
        double height;

        double area() {
            return width * height;
        }

        double perimeter() {
            return 2 * (width + height);
        }

        double diagonal() {
            return Math.sqrt(width * width + height * height);
        }
//main
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            exercise1_8_75 rect = new exercise1_8_75();

            rect.width = sc.nextDouble();
            rect.height = sc.nextDouble();
        sc.close();
        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETRO = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        }
    }