package lista1;
import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pe, polegada, jarda, milha;
		System.out.printf("--- CONVERSÃO DE PÉS --- \n   Digite uma medida em pés para ser convertida:");
		pe = scan.nextDouble();
		polegada = pe * 12;
		jarda = pe / 3;
		milha = jarda / 1760;
		scan.close();
		System.out.printf("   %.2f - PES \n   %.2f - POLEGADAS \n   %.2f - JARDAS \n   %.2f - MILHAS", pe, polegada, jarda, milha);
	}

}
