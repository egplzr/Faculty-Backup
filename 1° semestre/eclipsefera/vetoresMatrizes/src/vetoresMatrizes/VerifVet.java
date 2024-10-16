package vetoresMatrizes;

import java.util.Random;

public class VerifVet {
	static Random rand = new Random();

	public static void main(String[] args) {
		int[] vet = new int[10];
		int num = 11;

		for (int i = 0; i < 10; i++) {
			vet[i] = rand.nextInt(11);
		}
		if (analVet(vet, num) == false) {
			System.out.printf("O número %02d não existe dentro do vetor.", num);
		} else {
			System.out.printf("O número %02d existe dentro do vetor.", num);

		}
	}

	public static boolean analVet(int[] vet, int num) {
		for (int a1 : vet) {
			if (a1 == num) {
				return true;
			}
		}
		return false;
	}

}
