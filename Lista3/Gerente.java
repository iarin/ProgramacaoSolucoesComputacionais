public class Gerente extends Funcionario {
    // Atributo privado
    private double bonus;

    // Construtor para inicializar os atributos de Funcionario e Gerente
    public Gerente(double salario, String departamento, double bonus) {
        super(salario, departamento); // Chama o construtor da superclasse Funcionario
        this.bonus = bonus;
    }

    // Método para obter o bônus
    public double getBonus() {
        return bonus;
    }

    // Método para definir o bônus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Sobrescrevendo o método exibirInformacoes para incluir o bônus
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da superclasse
        System.out.println("Bônus: " + bonus);
    }

    // Implementação do método trabalhar da interface Trabalhador
    @Override
    public void trabalhar() {
        System.out.println("O gerente está trabalhando.");
    }
}