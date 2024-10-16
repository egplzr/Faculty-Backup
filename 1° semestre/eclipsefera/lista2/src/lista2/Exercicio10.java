package lista2;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que dados três valores X, Y e Z, verifique se eles podem ser os
		   comprimentos dos lados de um triângulo e, se forem, verifique se é um triângulo
		   equilátero, isósceles ou escaleno. Considere que:
				• O comprimento de cada lado de um triângulo é menor do que a soma dos
				  outros dois lados;
				• Chama-se equilátero o triângulo que tem três lados iguais;
				• Chama-se isósceles o triângulo que tem o comprimento de dois lados iguais;
				• Recebe o nome de escaleno o triângulo que tem os três lados diferentes. 
		 */

		int i, j, linhas = 4;
		int x, y, z;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a medida de três lados x, y e z para ver se é possível formar um triângulo: ");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		scan.close();
		
		if (x < y + z && y < x + z && z < x + y) {
			if (x == y && y == z) {
				System.out.println("\n É possível formar um triangulo equilátero com as medidas fornecidas \n");
				for (i=0; i<linhas; i++) {
					for (j=linhas-i; j>1; j--) {
						System.out.print(" ");
					}
					for (j=0; j<=i; j++) {
						System.out.print(" *");
					}
					System.out.println();
				}
			} else if (x == y || x == z || y == z) {
				System.out.println("\n É possível formar um triangulo isósceles com as medidas fornecidas \n");
				for (i=0; i<linhas; i++) {
					for (j=linhas-i; j>1; j--) {
						System.out.print(" ");
					}
					for (j=0; j<=i; j++) {
						System.out.print("     *");
					}
					System.out.println();
				}
			} else {
				System.out.println("\n É possível formar um triangulo escaleno com as medidas fornecidas \n");
				for (i=0; i<linhas; i++) {
					for (j=linhas-i; j>1; j--) {
						System.out.print("");
					}
					for (j=0; j<=i; j++) {
						System.out.print(" *  ");
					}
					System.out.println();
				}
			}
		} else {
			System.out.println("\n Não é possível formar um triângulo com essas medidas. \n");
			for (i=0; i<linhas; i++) {
				for (j=linhas-i; j>1; j--) {
					System.out.print("  x");
				}
				for (j=0; j<=i; j++) {
					System.out.print("  x");
				}
				System.out.println();
			}
		}
		
		
		
	}

}
