import java.util.Scanner;

public class IdentificaNumero {
    public static void main(String args[]) {
        float numero1, numero2;
        Scanner entrada;
        // Instancia o objeto da classe Scanner
        entrada = new Scanner(System.in);
        // Mostra mensagem solicitando o primeiro número
        System.out.print("Digite o primeiro número: ");
        // Recebe o valor do primeiro número
        numero1 = entrada.nextFloat();
        // Mostra mensagem solicitando o segundo número
        System.out.print("Digite o segundo número: ");
        // Recebe o valor do segundo número
        numero2 = entrada.nextFloat();
        // Determina e mostra o maior número
        if (numero1 > numero2)
            System.out.println("O maior número é: " + numero1);
        else if (numero2 > numero1)
            System.out.println("O maior número é: " + numero2);
        else
            System.out.println("Os números são iguais");
    }
}
