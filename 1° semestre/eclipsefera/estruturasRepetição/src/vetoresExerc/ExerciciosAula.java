package vetoresExerc;

import java.util.Random;

public class ExerciciosAula {

	public static void main(String[] args) {
		int i =0;
		Random rand = new Random();

		int[] numeros = new int[10];
		for (i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(101);
		}
		for (int a : numeros) {
			System.out.println(a);
		}
	}
}
