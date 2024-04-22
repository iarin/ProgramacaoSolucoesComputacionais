import java.util.Scanner;
public class ex_6
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int soma_pares = 0;
        int soma_impares = 0;
        int soma_div3 = 0;
	    for (int c = 1; c<=10; c++) {
	      System.out.println("Digite o " + c + "° numero: ");
	      int numero = sc.nextInt();
	      if (numero % 2 == 0) {
            soma_pares += numero;
          } 
          else {
            soma_impares += numero;
          }

          if (numero % 3 == 0) {
                soma_div3 += numero;
          }
	    }
		System.out.println("A soma dos valores pares somados é: " + soma_pares);
        System.out.println("A soma dos valores impares somados é: " + soma_impares);
        System.out.println("A soma dos valores divisiveis por 3 somados é: " + soma_div3);
	}
}