package vetoresMatrizes;

import java.util.Random;

public class MatrizTri {
	static Random rand = new Random();
	public static void main(String[] args) {
		arrayTri();
	}
	
	public static void arrayTri() {
		int [][][] matriz = new int [2][2][2];
		
		for (int face = 0; face < matriz.length; face++) {
			for (int lin = 0; lin < matriz[face].length; lin++) {
				for (int col = 0; col < matriz[face][lin].length; col++) {
					matriz[face][lin][col] = rand.nextInt(101);
				}
			}
		}
		exibirArray(matriz);
	}
	
	public static void exibirArray (int [][][] matriz) {
		for (int[][] a1 : matriz) {
			System.out.println("\n face \n");
			for (int[] a2 : a1) {
				System.out.print("[ ");
				for (int a3 : a2) {
					System.out.printf("%03d ", a3);
				}
			System.out.println(" ]");
			}
		}
	}
}
