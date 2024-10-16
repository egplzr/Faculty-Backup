package lista2;
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que receba a hora de início e a hora de término de um jogo (cada
		   hora é composta por duas variáveis hora e minuto). Calcule e mostre a duração do
		   jogo (horas e minutos), sabendo-se que o tempo máximo da duração do jogo é de
		   24 horas e que ele pode iniciar-se em um dia e terminar no dia seguinte.
		 */

		int hI, mI, hT, mT, hD, mD;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a hora[0-23] e o minuto[0-59] (separadamente) em que o jogo foi iniciado:");
		hI = scan.nextInt();
		mI = scan.nextInt();
		System.out.println("Digite a hora[0-23] e o minuto[0-59] (separadamente) em que o jogo foi terminado:");
		hT = scan.nextInt();
		mT = scan.nextInt();
		scan.close();
		
		hD = hT - hI;
		mD = mT - mI;
		if (hD < 0) {
			hD += 24;
		}
		if (mD < 0) {
			mD += 60;
		}
		
		System.out.printf("O jogo durou %d horas e %d minutos.", hD, mD);
	}

}
