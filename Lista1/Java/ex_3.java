import java.util.Scanner;
public class ex_3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int qtd_pares = 0;
	    for (int c = 1; c<=10; c++) {
	      System.out.println("Digite o " + c + "° numero: ");
	      int numero = sc.nextInt();
	      if (numero % 2 == 0) {
            qtd_pares ++;
          }
	    }
		System.out.println("O número de valores pares digitados é: " + qtd_pares);
	}
}