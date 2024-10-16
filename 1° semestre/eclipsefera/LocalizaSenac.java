package lista2;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class LocalizaSenac {
	public static void main(String[] args) {
		String letraSala;
		int nSala, n;
		Scanner leia = new Scanner(System.in);
		System.out.println("Bem-vindo ao programa LOCALIZA SENAC!");
		System.out.println("O que você deseja?");
		System.out.println("----------------------------------\n" + "| 1. Encontrar minha sala         |\n"
				+ "|                                 |\n" + "| 2. Calendário                   |\n"
				+ "----------------------------------");
		n = leia.nextInt();
		if (n == 1) {
			System.out.println("Informe sua sala:");
			letraSala = leia.next(); 
			letraSala = letraSala.substring(0,1);
			if (letraSala.equalsIgnoreCase("a")) {
				System.out.println("       Prédio 1        Térreo         Ala A  ");
				System.out.println("-----------------------------------------------------\n"
						 + "|                                                   |\n"
				         + "|                                                   |\n"
				         + "|         ____      _____________       ____        |\n"
				         + "|        |    |    |             |     |    |       |\n"
				         + "|        |    |    |             |     |    |       |\n"
				         + "|        |    |    |             |     |    |       |\n"
				         + "|        |    |    |             |     |    |       |\n"
				         + "|        |____|    |_____________|     |____|       |\n"
				         + "|************************************************** |\n"
				         + "|************************************************** |\n"
				         + "|************************************************** |\n"
	 			         + "-----------------------------------------------------");
			}else if (letraSala.equalsIgnoreCase("b")) {
				System.out.println("       Prédio 1        Térreo         Ala A  ");
				System.out.println("-----------------------------------------------------\n"
						 + "|************************************************** |\n"
				         + "|**************************************************|\n"
				         + "|         ____      _____________       ____        |\n"
				         + "|        |    |    |             |     |    |       |\n"
				         + "|        |    |    |             |     |    |       |\n"
				         + "|        |    |    |             |     |    |       |\n"
				         + "|        |    |    |             |     |    |       |\n"
				         + "|        |____|    |_____________|     |____|       |\n"
				         + "|                                                   |\n"
				         + "|                                                   |\n"
				         + "|                                                   |\n"
	 			         + "-----------------------------------------------------");
	
		} 
	}
}
}