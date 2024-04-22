import java.util.Scanner;
public class ex_7
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    for (int c = 1000; c<=2000; c++) {
	      if (c % 5 == 3) {
            System.out.println(c);
          } 
	    }
	}
}