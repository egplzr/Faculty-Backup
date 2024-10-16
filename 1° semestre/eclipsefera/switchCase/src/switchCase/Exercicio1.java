package switchCase;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String plano;

		System.out.println("Digite qual o nível do seu plano de saúde: ");
		System.out.println("     [BÁSICO | BRONZE | PRATA | OURO]");
		plano = scan.next();
		
		switch (plano) {
		case "básico":
			System.out.println("Valor do plano: R$150,00");
			break;
		case "bronze":
			System.out.println("Valor do plano: R$220,00");
			break;
		case "prata":
			System.out.println("Valor do plano: R$310,00");
			break;
		case "ouro":
			System.out.println("Valor do plano: R$450,00");
			break;
		default:
			System.out.println("PLANO INVÁLIDO.");
		}
		
		scan.close();
	}

}
