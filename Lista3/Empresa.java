public class Empresa {
    // Método para adicionar um trabalhador e chamar o método trabalhar
    public void adicionarTrabalhador(Trabalhador trabalhador) {
        trabalhador.trabalhar();
    }

    public static void main(String[] args) {
        // Criando objetos Funcionario e Gerente
        Funcionario funcionario = new Funcionario(3000.0, "Financeiro");
        Gerente gerente = new Gerente(5000.0, "Vendas", 1000.0);

        // Criando um objeto Empresa
        Empresa empresa = new Empresa();

        // Adicionando Funcionario e Gerente à empresa
        empresa.adicionarTrabalhador(funcionario);
        empresa.adicionarTrabalhador(gerente);
    }
}