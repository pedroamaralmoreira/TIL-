package folhas.section_10_98;
import java.util.Scanner;

public class Negatives_98 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt();
        }

        System.out.println(java.util.Arrays.toString(vect));

        for (int i=0; i<n; i++){
            if (vect[i]<0){
                System.out.println(vect[i]);
            }

            // Faz o Java pausar por 1 segundo (1000 milissegundos) antes de ir para o próximo i
            try { Thread.sleep(1000); } catch (Exception e) {}
        }

    }



}
