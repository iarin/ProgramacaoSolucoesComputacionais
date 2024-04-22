import java.util.Scanner;
public class ex_1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int soma_idade = 0;
	    for (int c = 1; c<=10; c++) {
	      System.out.println("Digite a idade da " + c + "° pessoa: ");
	      int idade = sc.nextInt();
	      soma_idade += idade;
	    }
		System.out.println("A soma das idades informadas é: " + soma_idade);
	}
}