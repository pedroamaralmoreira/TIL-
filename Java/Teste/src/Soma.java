import java.util.*;

public class Soma {
    public static void main(String args[]) {
        int numero1, numero2, soma;
        Scanner entrada;

        // Instancia o objeto da classe Scanner para receber as entradas
        entrada = new Scanner(System.in);

        // Recebe os dois números
        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        // Soma os números digitados
        soma = numero1 + numero2;

        // Mostra o resultado da soma
        System.out.println("A soma é: " + soma);
    }
}
