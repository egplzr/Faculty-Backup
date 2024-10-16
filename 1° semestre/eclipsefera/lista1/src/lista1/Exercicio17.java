package lista1;
import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double cat1, cat2, hip;
		System.out.println("Vamos calcular o valor da hipotenusa de um triangulo! \n Informe o valor dos catetos: ");
		cat1 = scan.nextDouble();
		cat2 = scan.nextDouble();
		hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		scan.close();
		System.out.printf(" %.0f - CATETO 1 \n %.0f - CATETO 2 \n %.0f - HIPOTENUSA", cat1, cat2, hip);
	}

}
