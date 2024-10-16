package vetoresMatrizes;
import java.util.Random;
public class MatrizExAula {
	static Random rand = new Random();

	public static void main(String[] args) {
		arrayBi();	
		
		/*for reduzido "for each"
		 * for (int var : array) {}
		 * Criar uma variável de acordo com o tipo que vai ser percorrido.
		 * 
		 * para array bidimensional: 
		 * for (int[] a1 : matriz){
		 * 		for (int n : a1) {
		 * 			
		 *      }
		 * }
		 */
	}

	public static void arrayBi() {
		//Array bidimensional de 4 x 10
		int [][] matriz = new int [4][10];
		//Preenchendo o array bidimensional
		for (int lin = 0; lin < matriz.length; lin++) {
			for (int col = 0; col < matriz[lin].length; col++) {
				int num;
				do {
					num = rand.nextInt(101);
				} while (analVet(matriz[lin], num));
				matriz[lin][col] = num;
			}
		}
		exibirArray(matriz);
	}
	
	public static void exibirArray (int [][] matriz) {
		for (int[] a1 : matriz) {
			System.out.print("[ ");
			for (int n : a1) {
				System.out.printf("%03d ", n);
			}	
			System.out.println(" ]");
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
