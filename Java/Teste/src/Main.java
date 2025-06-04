import java.util.Scanner;
import java.util.*;
public class Main {

        public static void main(String args[]) {
            float valorDeposito, taxaJuros, valorRendimento, valorTotal;
            Scanner entrada;

            // Instancia o objeto da classe Scanner para receber as entradas
            entrada = new Scanner(System.in);

            // Mostra mensagem antes da leitura do valor do depósito
            System.out.print("Digite o valor do depósito: ");
            // Recebe o valor do depósito
            valorDeposito = entrada.nextFloat();

            // Mostra mensagem antes da leitura da taxa de juros
            System.out.print("Digite a taxa de juros: ");
            // Recebe a taxa de juros
            taxaJuros = entrada.nextFloat();

            // Calcula o valor do rendimento
            valorRendimento = valorDeposito * taxaJuros / 100;

            // Calcula o valor total
            valorTotal = valorDeposito + valorRendimento;

            // Mostra o valor do rendimento
            System.out.println("Rendimento = " + valorRendimento);
            // Mostra o valor total
            System.out.println("Total = " + valorTotal);
        }
    }