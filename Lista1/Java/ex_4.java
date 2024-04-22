import java.util.Scanner;
public class ex_4
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int qtd_pessoas = 0;
        double media_idade = 0;
	    for (int c = 1; c<=7; c++) {
	      System.out.println("Digite a idade da " + c + "° pessoa: ");
	      int idade = sc.nextInt();
          media_idade += idade;
          System.out.println("Digite o peso da " + c + "° pessoa: ");
          double peso = sc.nextDouble();
          if (peso > 90) {
            qtd_pessoas ++;
          }
          if (c == 7) {
            media_idade = media_idade/c;
          }
	    }
		System.out.println("A media das idades é : " + media_idade);
		System.out.println("A quantidade de pessoas com mais de 90kg é : " + qtd_pessoas);
	}
}