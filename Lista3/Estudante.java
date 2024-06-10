import java.util.Scanner;

public class Estudante extends Pessoa {
    // Atributo privado
    private String curso;

    // Construtor para inicializar os atributos de Pessoa e Estudante
    public Estudante(String nome, int idade, String curso) {
        super(nome, idade); // Chama o construtor da superclasse Pessoa
        this.curso = curso;
    }

    // Construtor para inicializar apenas o nome e o curso
    public Estudante(String nome, String curso) {
        super(nome); // Chama o novo construtor da superclasse Pessoa
        this.curso = curso;
    }

    // Método para obter o curso
    public String getCurso() {
        return curso;
    }

    // Método para definir o curso
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobrescrevendo o método exibirInformacoes para incluir o curso
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da superclasse
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que digite o nome
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        // Solicitando ao usuário que digite a idade (opcional)
        System.out.print("Digite a idade (ou pressione Enter para pular): ");
        String idadeInput = scanner.nextLine();
        int idade = idadeInput.isEmpty() ? 0 : Integer.parseInt(idadeInput);

        // Solicitando ao usuário que digite o curso
        System.out.print("Digite o curso: ");
        String curso = scanner.nextLine();

        // Criando um objeto da classe Estudante com os valores fornecidos pelo usuário
        Estudante estudante;
        if (idade == 0) {
            estudante = new Estudante(nome, curso); // Usa o novo construtor se a idade não for fornecida
        } else {
            estudante = new Estudante(nome, idade, curso); // Usa o construtor completo se a idade for fornecida
        }

        // Exibindo as informações do estudante
        estudante.exibirInformacoes();

        // Fechando o scanner
        scanner.close();
    }
}