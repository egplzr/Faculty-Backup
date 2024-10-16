package estruturasRepetição;
import java.util.Scanner;
public class DivPor2e3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Informe o número inicial e final de uma contagem para saber quais são divisíveis por 2 e por 3 ao mesmo tempo: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		
		div2ou3(n1, n2);
		
		scan.close();
	}
	
	public static void div2ou3 (int n, int nf) {
		for (int i = n ; i <= nf ; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
