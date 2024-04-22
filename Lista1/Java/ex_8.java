import java.util.Scanner;
public class ex_8
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber sua tabuada: ");
        int numero = sc.nextInt();
        System.out.println("Tabuada do número " + numero);
	    for (int c = 0; c<=100; c++) {
	      System.out.println(numero + " x " + c + " = " + numero*c);
	    }
	}
}