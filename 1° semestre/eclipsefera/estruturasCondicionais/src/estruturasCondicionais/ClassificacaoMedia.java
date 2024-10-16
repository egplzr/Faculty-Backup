package estruturasCondicionais;
import java.util.Scanner;
public class ClassificacaoMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		double n1, n2, n3, n4, media;
		System.out.println("Digite seu nome:");
		nome = scan.next();
		System.out.println("Digite suas 4 notas[0 a 100]: ");
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();
		n4 = scan.nextDouble();
		media = (n1 + n2 + n3 + n4)/4;
		scan.close();
		if (media <= 20) {
			System.out.printf("ALUNO: %s | MEDIA: %.2f | CLASSIFICAÇÃO: PÉSSIMO", nome, media);
		} else if (media > 20 && media <= 40) {
			System.out.printf("ALUNO: %s | MEDIA: %.2f | CLASSIFICAÇÃO: RUIM", nome, media);
		} else if (media > 40 && media <= 60) {
			System.out.printf("ALUNO: %s | MEDIA: %.2f | CLASSIFICAÇÃO: REGULAR", nome, media);	
		} else if (media > 60 && media <= 80) {
			System.out.printf("ALUNO: %s | MEDIA: %.2f | CLASSIFICAÇÃO: BOM", nome, media);
		} else if (media > 80) {
			System.out.printf("ALUNO: %s | MEDIA: %.2f | CLASSIFICAÇÃO: ÓTIMO", nome, media);
		}

	}

}
