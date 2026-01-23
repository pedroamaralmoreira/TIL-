package folhas.section_8_80.application;
import folhas.section_8_80.util.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;
// ler cotação do dolar
// ler valor em dolares
//calcular valor atualizado com iof
//mostrar valor real

public class Program {

    public static void main(String[] args){

        //puxando os imports la de cima
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        //perguntas:
        System.out.print("Whats the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(dollars,dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);
    }
}
