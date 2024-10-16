package vetoresExerc;
import java.util.Random;
import java.util.Scanner;
public class matriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nome = new String [] {"Enaldinho","BrunoPH", "LOUDEcoringa", "LULAinacio"};
		double[][] notas = new double[4][4];
		Random rand =  new Random();
		
		for (int i = 0; i < nome.length; i++) {
			double media = 0;
			
			for (int j = 0; j < 3; j++) {
				notas [i][j] = rand.nextDouble(11);
				media += notas[i][j];
			}
			notas[i][3] = media/3;
			
		}
		int i = 0;
		for (String nomes: nome ) {
			
			System.out.printf("Media %s: %.2f\n", nomes, notas[i][3]);
			i++;
		
		/*
		 * double valorRef;
		double[][] listaCons = new double [2][7];
		
		System.out.println("Digite um valor de referencia: ");
		valorRef = scan.nextDouble();
		
		for (int i = 0; i < listaCons.length; i++) {
			for (int j = 0; j < listaCons.length; j++) {
				System.out.println("Digite a quant de KW gasta: ");
				listaCons[i][j] = scan.nextDouble();
				System.out.println("Digite o tipo do consumidor: ");
				listaCons[i][j] = scan.nextDouble();
				
				
			}
		}
		 */
		
		
		
		}
	}
}
