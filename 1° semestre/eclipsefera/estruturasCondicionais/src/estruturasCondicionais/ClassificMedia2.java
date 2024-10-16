package estruturasCondicionais;

import java.util.Scanner;

public class ClassificMedia2 {

	public static void main(String[] args) {
		
		// Jeito melhor de fazer o último código(ClassificacaoMedia)
		
		Scanner scan = new Scanner(System.in);
		String nome, classif;
		double n1, n2, n3, n4, media;
		
		System.out.println("Digite seu nome:");
		nome = scan.next();
		
		System.out.println("Digite suas 4 notas[0 a 100]: ");
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();
		n4 = scan.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		scan.close();
		
		if (media <= 20) {
			classif = "PÉSSIMO";
		} else if (media > 20 && media <= 40) {
			classif = "RUIM";
		} else if (media > 40 && media <= 60) {
			classif = "REGULAR";
		} else if (media > 60 && media <= 80) {
			classif = "BOM";
		} else {
			classif = "ÓTIMO";
		}
		
		System.out.printf("ALUNO: %s | MEDIA: %.2f | CLASSIFICAÇÃO: %s", nome, media, classif);

	}

}