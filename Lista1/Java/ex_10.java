import java.util.Scanner;
public class ex_10
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("Digite um número para saber se ele é um número primo: ");
        int numero = sc.nextInt();
        for (int c = 1; c <= numero; c++) {
            if (numero % c == 0) {
                contador ++;
            }
        }
        if (contador == 2 || numero == 1) {
        System.out.println("O número " + numero + " é primo!");
        }
        else {System.out.println("O número " + numero + " não é primo!");
       }        
    }
}