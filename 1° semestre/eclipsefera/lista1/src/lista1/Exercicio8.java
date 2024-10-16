package lista1;
import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b, h, area;
		System.out.println("Vamos calcular a área de um triangulo! \n Informe o tamanho da base:");
		b = scan.nextInt();
		System.out.println("Agora informe a altura do triangulo:");
		h = scan.nextInt();
		area = b*h/2;
		scan.close();
		System.out.printf("A area do triangulo é: %d", area);
	}

}
