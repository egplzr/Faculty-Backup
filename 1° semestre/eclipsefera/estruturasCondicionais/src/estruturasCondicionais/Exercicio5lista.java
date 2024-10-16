package estruturasCondicionais;
import java.util.Scanner;
public class Exercicio5lista {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Digite 3 números: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		scan.close();
		
		/* alternativa para não deixar a linha do if tão grande e com tantos operadores: 
		verificar o menor entre n1 e n2 e dps verificar o n3, fazendo uma cadeia de ifs */
		if (n1 <= n3 && n3 <= n2 || n2 <= n3 && n3 <= n1) {
			System.out.println("O 3° número digitado está entre os dois primeiros.");
		} else {
			System.out.println("O 3° número digitado não está entre os dois primeiros");
		}
	}

}
