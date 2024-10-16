package switchCase;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String cod;
		double quant;
		
		System.out.println("Digite o código do produto comprado: ");
		cod = scan.next();
		System.out.println("Digite a quantidade:");
		quant = scan.nextInt();
		
		switch (cod){
		case "A001":
			System.out.println("O valor total da dívida é de: " + quant*7.5);
			break;
		case "A002":
			System.out.println("O valor total da dívida é de: " + quant*9.9);
			break;
		case "A003":
			System.out.println("O valor total da dívida é de: " + quant*14);
			break;
		case "A004":
			System.out.println("O valor total da dívida é de: " + quant*19.99);
			break;
		default:
			System.out.println("CÓDIGO INVÁLIDO.");
		}
		
		scan.close();
	}

}
