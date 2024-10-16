package lista1;
import java.util.Scanner;
public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, p1, p2, p3, media;
		System.out.println("Digite a primeira nota e seu peso: ");
		n1 = scan.nextDouble();
		p1 = scan.nextDouble();
		System.out.println("Digite a segunda nota e seu peso: ");
		n2 = scan.nextDouble();
		p2 = scan.nextDouble();
		System.out.println("Digite a terceira nota e seu peso: ");
		n3 = scan.nextDouble();
		p3 = scan.nextDouble();
		media = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);
		System.out.printf("A media das suas notas e: %4.2f", media);
		scan.close();
	}

}
