package estruturasCondicionais;
import java.util.Scanner;
public class MediaTernario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2, media;
		System.out.println("Digite as notas: ");
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		media = (n1 + n2) / 2;
		scan.close();
		System.out.println(media >= 5 ? "Aprovado" : "Reprovado");
	}

}
