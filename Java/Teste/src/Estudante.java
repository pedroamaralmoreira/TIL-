class Estudante {
    public int matricula;
    public String nome;
    /* Método para definir os dados do objeto estudante*/
    public void atribuirDados(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    /* Método para exibir os dados do objeto estudante*/
    public void exibirDados() {
        System.out.println("Matrícula do estudante: " + matricula);
        System.out.println("Nome do estudante: " + nome);
        System.out.println();
    }
    public static void main(String args[]) {
        /* Declaração de um array de estudante*/
        Estudante[] estudante;
        /* Alocação de memória para 2 objetos do tipo estudante*/
        estudante = new Estudante[2];
        /* Criação de objetos reais de estudante*/
        estudante[0] = new Estudante();
        estudante[1] = new Estudante();
        /* Atribuição de dados a objetos de estudante*/
        estudante[0].atribuirDados(2021110821, "Jorge Felipe");
        estudante[1].atribuirDados(2021110814, "Carlos Silva");
        /* Exibição dos dados do estudante*/
        System.out.println("Dados do aluno 1: ");
        estudante[0].exibirDados();
        System.out.println("Dados do aluno 2: ");
        estudante[1].exibirDados();
    }
}
