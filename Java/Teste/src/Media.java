import java.util.Scanner;

public class Media {
    public static void main(String args[]) {
        float mediaAluno;
        Scanner entrada;
        // Instancia o objeto da classe Scanner
        entrada = new Scanner(System.in);
        // Mostra mensagem solicitando a média do aluno
        System.out.print("Digite a média do aluno: ");
        // Recebe o valor da media do aluno
        mediaAluno = entrada.nextFloat();
        // Mostra o resultado obtido após análise da média do aluno
        if (mediaAluno >= 6 && mediaAluno <= 10)
            System.out.println("Você está aprovado!");
        if (mediaAluno < 6)
            System.out.println("Você está reprovado!");
    }
}
