import java.util.Scanner;
public class ex_11
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int soma_idade = 0;
        int media_idade = 0;
		int qtd_pessoas = 0;
	    for (int c = 1; c<=7; c++) {
	      System.out.println("Digite a idade da " + c + "° pessoa: ");
	      int idade = sc.nextInt();
          soma_idade += idade;
          System.out.println("Digite a altura da " + c + "° pessoa: ");
          double peso = sc.nextDouble();
		  if (peso > 90) {
			qtd_pessoas ++;
		  }
	    }
        media_idade = soma_idade/7;
        
		System.out.println("A quantidade de pessoas com mais de 90kg é : " + qtd_pessoas);
        System.out.println("A média da idade é : " + media_idade);
	}
}