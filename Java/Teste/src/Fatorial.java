import java.util.Scanner;

public class Fatorial {
    public static void main(String args[]) {
        Scanner dado = new Scanner(System.in);
        int numero, i, fatorial;
        System.out.print("Digite um número: ");
        numero = dado.nextInt();
        fatorial = 1;
        i = 2;
        while (i <= numero) {
            fatorial = fatorial * i;
            i = i + 1;
        }
        System.out.println("Fatorial de " + numero + " = " + fatorial);
    }
}
