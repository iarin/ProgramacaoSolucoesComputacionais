import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Charles", 30));
        pessoas.add(new Estudante("Cristina", 20, "Engenharia"));
        pessoas.add(new Estudante("Debora", "Medicina"));

        for (Pessoa pessoa : pessoas) {
            pessoa.exibirInformacoes();
            System.out.println(); 


        List<Veiculo> veiculos = new ArrayList<>();
        
        veiculos.add(new Carro());
        veiculos.add(new Moto());
                   
        for (Veiculo veiculo : veiculos) {
            veiculo.mover();
            }
        }
    }
}