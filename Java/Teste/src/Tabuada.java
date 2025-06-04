import java.util.Scanner;

class Tabuada {
    public static void main(String args[]) {
        int numero, i;
        System.out.print("Entre com um valor inteiro de 1 a 9: ");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        System.out.println("Tabuada de " + numero);
        for (i = 1; i <= 10; i++)
            System.out.println(numero + " * " + i + " = " + (numero * i));
    }
}
