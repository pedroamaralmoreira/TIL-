import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String args[]) {
        Scanner dado = new Scanner(System.in);
        float base, altura, area;
        do {
            System.out.print("Digite a medida da base do triângulo: ");
            base = dado.nextFloat();
        } while (base <= 0);
        do {
            System.out.print("Digite a medida da altura do triângulo: ");
            altura = dado.nextFloat();
        } while (altura <= 0);
        area = base * altura / 2;
        System.out.print("Área do triângulo é: " + area);
    }
}