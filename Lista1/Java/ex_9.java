import java.util.Scanner;
public class ex_9
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String expressao = "";
        int fatorial = 1;
        System.out.println("Digite um número para saber seu fatorial: ");
        int numero = sc.nextInt();
        System.out.println("Fatorial do número " + numero);
        for (int c = numero; c >= 1; c--) {
            fatorial *= c;
            expressao += c;
            if (c > 1) {
                expressao += " x ";
            }
        }
        System.out.println(numero + "! = " + expressao + " = " + fatorial);
    }
}