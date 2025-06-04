public class Empregado {
    String nome;
    int idade;
    String funcao;
    double salario;
    /* Este é o método construtor da classe.*/
    public Empregado(String nome) {
        this.nome = nome;
    }
    /* Atribui a idade do empregado à variável idade. */
    public void atribuirIdade(int idadeEmpregado) {
        idade = idadeEmpregado;
    }
    /* Atribui a função do empregado à variável empregado. */
    public void atribuirFuncao(String funcaoEmpregado) {
        funcao = funcaoEmpregado;
    }
    /* Atribui o salário do empregado à variável salário. */
    public void atribuirSalario(double salarioEmpregado) {
        salario = salarioEmpregado;
    }
    /* Este método imprime os detalhes do empregado.*/
    public void exibirEmpregado() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Função: " + funcao);
        System.out.println("Salário: " + salario);
    }
    /* Este é o método principal da classe.*/
    public static void main(String args[]) {
        /* Cria dois objetos usando o método construtor ao instanciar a classe. */
        Empregado primeiroEmpregado = new Empregado("João Silva");
        Empregado segundoEmpregado = new Empregado("Carla Sousa");
        /* Invoca os métodos para cada um dos objetos criados. */
        primeiroEmpregado.atribuirIdade(26);
        primeiroEmpregado.atribuirFuncao("Analista de Sistemas");
        primeiroEmpregado.atribuirSalario(5000);
        primeiroEmpregado.exibirEmpregado();
        System.out.println();
        segundoEmpregado.atribuirIdade(21);
        segundoEmpregado.atribuirFuncao("Analista de Requistos");
        segundoEmpregado.atribuirSalario(4200);
        segundoEmpregado.exibirEmpregado();
    }
}
