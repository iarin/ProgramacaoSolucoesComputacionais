import java.util.Scanner;
public class ex_2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double maior_numero = 0;
	    for (int c = 1; c<=5; c++) {
	      System.out.println("Digite o  " + c + "° numero: ");
	      double numero = sc.nextDouble();
	      if (numero > maior_numero) {
            maior_numero = numero;
          }
	    }
		System.out.println("O maior número é: " + maior_numero);
	}
}