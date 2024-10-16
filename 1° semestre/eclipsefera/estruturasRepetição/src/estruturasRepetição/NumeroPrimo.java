package estruturasRepetição;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		long inicio, fim;
		
		System.out.println("Digite um número: ");
		n = scan.nextInt();
		scan.close();
		inicio = System.currentTimeMillis();
		System.out.println(ehPrimo(n)? "muito primo":"pouco primo");
		fim = System.currentTimeMillis();
		System.out.println("Duração: " + (fim - inicio));
		
	}
	
	public static boolean ehPrimo (int num) {
		int qtdDiv = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				qtdDiv++;
				if (qtdDiv > 2) {
					break;
				}
			}
		}
		return qtdDiv == 2;
	}

}

/*
 * public static boolean ehPrimo (int num) {
		int qtdDiv = 0;
		boolean primo;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				qtdDiv++;
			}
		}
		if (qtdDiv > 2) {
			primo = false;
		} else {
			primo = true;
		}
		return primo;
 */
