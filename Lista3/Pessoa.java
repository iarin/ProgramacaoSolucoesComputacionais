import java.util.Scanner;

public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Construtor para inicializar nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor para inicializar apenas o nome
    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0; // Define a idade como 0 por padrão
    }

    // Método para obter o nome
    public String getNome() {
        return nome;
    }

    // Método para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a idade
    public int getIdade() {
        return idade;
    }

    // Método para definir a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que digite o nome
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        // Solicitando ao usuário que digite a idade
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        // Criando um objeto da classe Pessoa com os valores fornecidos pelo usuário
        Pessoa pessoa = new Pessoa(nome, idade);

        // Exibindo as informações da pessoa
        pessoa.exibirInformacoes();

        // Fechando o scanner
        scanner.close();
    }
}