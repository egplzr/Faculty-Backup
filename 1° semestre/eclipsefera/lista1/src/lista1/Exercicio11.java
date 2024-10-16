package lista1;
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		double delta, x1, x2, a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("--- CALCULADORA DE EQUAÇÕES DE 2° GRAU ---");
		System.out.println("\n   Equação: x^2 − 5x + 6 = 0");
		System.out.print("   Informe a: ");
		a = scan.nextDouble();
		System.out.print("   Informe b: ");
		b = scan.nextDouble();
		System.out.print("   Informe c: ");
		c = scan.nextDouble();
		delta = Math.pow(b, 2) - 4*a*c;
		scan.close();
		if (delta == 0) {
			x1 = -b/2*a;
		} else if (delta < 0) {
			System.out.println("   NÃO EXISTEM RAÍZES REAIS.");
			System.out.printf("   Delta: %.0f", delta);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2*a);
			x2 = (-b - Math.sqrt(delta)) / (2*a);
			System.out.printf("   X1 = %.0f \n   X2 = %.0f \n   Delta = %.0f", x1, x2, delta);
		}

	}

}
