package estruturasRepetição;
import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		int num, rep;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite qual tabuada você quer ver e até qual número: ");
		num = scan.nextInt();
		rep = scan.nextInt();
		
		printTabuada(num, rep);
		
		scan.close();
	}
	
	public static void printTabuada (int n){
		printTabuada(n, 10);
	}
	
	public static void printTabuada (int n, int limite) {
		for (int i = 1; i <= limite; i++ ) {
			System.out.printf(" %02d x %02d = %03d%n", n, i, n*i);
		}
	}

}
