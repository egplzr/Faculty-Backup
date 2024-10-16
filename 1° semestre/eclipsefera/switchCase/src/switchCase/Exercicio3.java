package switchCase;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		int codProd, codCountry;
		double weight, tax=0, price=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o código do produto [n° entre 1 e 10]: ");
		codProd = scan.nextInt();
		System.out.println("Digite o código do país de origem do produto [n° entre 1 e 3]: ");
		codCountry = scan.nextInt();
		System.out.println("Digite o peso do produto em kgs: ");
		weight = scan.nextDouble();
		
		weight *= 1000;
		
		switch (codCountry) {
		case 2:
			tax = 0.15;
			break;
		case 3:
			tax = 0.25;
			break;
		}
		
		switch (codProd) {
		case 1, 2, 3, 4:
			price = 10*weight;
			break;
		case 5, 6, 7: 
			price = 25*weight;
			break;
		case 8, 9, 10:
			price = 35*weight;
			break;
		}
		
		scan.close();
		System.out.printf("PESO DO PRODUTO EM g:%10.0f \nPREÇO TOTAL DO PRODUTO COMPRADO:%10.2f \nIMPOSTO COBRADO:%10.2f \nVALOR TOTAL:%10.2f", weight, price, price*tax, price + price*tax);

	}

}
