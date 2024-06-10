public class Funcionario implements Trabalhador {
    // Atributos protegidos
    protected double salario;
    protected String departamento;

    // Construtor para inicializar os atributos
    public Funcionario(double salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }

    // Implementação do método trabalhar da interface Trabalhador
    @Override
    public void trabalhar() {
        System.out.println("O funcionário está trabalhando.");
    }
}