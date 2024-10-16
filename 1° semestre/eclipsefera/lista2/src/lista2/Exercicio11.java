package lista2;
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que mostre o menu de opções a seguir, receba a opção do usuário
		   e os dados necessários para executar cada operação.
									**** Menu de Opções *****
									1. Somar dois números
									2. Raiz quadrada de um número
									3. Elevar um número a uma potência
									**** Digite a opção desejada **** 
		 */
		
		double x, y, res;
		int opt;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("  **** Menu de Opções **** \n");
		System.out.println("    1. Somar dois números");
		System.out.println("    2. Raiz quadrada de um número");
		System.out.println("    3. Elevar um número a uma potência \n");
		System.out.println("  **** Digite a opção desejada ****");
		opt = scan.nextInt();
		
		if (opt == 1) {
			System.out.println("  ------ SOMA ------ \n");
			System.out.println("  Digite os números que serão somados: ");
			x = scan.nextDouble();
			y = scan.nextDouble();
			res = x+y;
			System.out.println("\n  ------ RESULTADO ------- \n");
			System.out.printf("    SOMA %.2f + %.2f = %.2f", x, y, res);
		} else if (opt == 2) {
			System.out.println("  ------ RAIZ QUADRADA ------ \n");
			System.out.println("  Digite o número para saber sua raiz: ");
			x = scan.nextDouble();
			System.out.println("\n  ------ RESULTADO ------- \n");
			System.out.printf("  RAIZ QUADRADA de %.2f = %.2f", x, Math.sqrt(x));
		} else if (opt == 3) {
			System.out.println("  ------ POTENCIAÇÃO ------ \n");
			System.out.println("  Digite um número e seu expoente: ");
			x = scan.nextDouble();
			y = scan.nextDouble();
			System.out.println("\n  ------ RESULTADO ------- \n");
			System.out.printf("  %.2f elevado a %.2f = %.2f", x, y, Math.pow(x, y));
		} else {
			System.out.println(" OPÇÃO INVÁLIDA.");
		}
		scan.close();
	}

}
