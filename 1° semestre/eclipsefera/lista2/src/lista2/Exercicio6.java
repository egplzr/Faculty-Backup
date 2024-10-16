package lista2;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		
		char sex;
		double alt, peso;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu sexo [M ou F]: ");
		sex = scan.next().charAt(0);
		
		if (sex == 'm' || sex == 'M') {
			System.out.println("Digite sua altura: ");
			alt = scan.nextDouble();
			peso = 52 + (0.75 * (alt - 152.4));
			System.out.printf("O peso ideal para uma pessoa com %.0f centímetros de altura é: %.2f", alt, peso);

		} else if (sex == 'f' || sex == 'F') {
			System.out.println("Digite sua altura: ");
			alt = scan.nextDouble();
			peso = 52 + (0.67 * (alt - 152.4));
			System.out.printf("O peso ideal para uma pessoa com %.0f centímetros de altura é: %.2f", alt, peso);

		} else {
			System.out.println("CARACTERE INVÁLIDO");
			peso = 0;
		}
		scan.close();
	}

}
