import java.util.Scanner;
public class ex_5
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int qtd_idade = 0;
        double media_altura = 0;
		int contador = 0;
        double peso_inferior = 0;
		double porcentagem = 0;
	    for (int c = 1; c<=25; c++) {
	      System.out.println("Digite a idade da " + c + "° pessoa: ");
	      int idade = sc.nextInt();
          if (idade > 50) {
            qtd_idade ++;
          }
          System.out.println("Digite a altura da " + c + "° pessoa: ");
          double altura = sc.nextDouble();
          if (idade > 10 && idade < 20) {
			media_altura += altura;
			contador ++;
		  }
          System.out.println("Digite o peso da " + c + "° pessoa: ");
          double peso = sc.nextDouble();
          if (peso < 40) {
            peso_inferior ++;
          }
          if (c == 25) {
            porcentagem = peso_inferior/c * 100;
            }
	    }
        System.out.println("O numero de pessoas com idade superior a 50 é : " + qtd_idade);
        System.out.println("A média da altura das pessoas com idade entre 10 e 20 é : " + (media_altura/contador));
        System.out.println("A porcentagem de pessoas com peso inferior a 40kg é : " + porcentagem + "%");
    }
}