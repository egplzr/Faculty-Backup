package lista2;
import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que receba 3 notas de um aluno e calcule a média. Caso a média
		   calculada seja maior ou igual a 6, o algoritmo deverá exibir a mensagem de aluno
		   aprovado. Caso a média seja abaixo de 5, o algoritmo deverá exibir a mensagem de
		   aluno reprovado. Caso a média esteja entre 5 e 6, o algoritmo deverá exibir que o
		   aluno está de recuperação e solicitar a nota da atividade de recuperação, calcular
		   uma nova média entre a média inicial e a nota de recuperação e caso esta nova
		   média seja abaixo de 6 informar que o aluno está reprovado, caso contrário, informar
		   que o aluno está aprovado por recuperação.
		 */

		double n1, n2, n3, media, rec;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite suas três notas para calcular a média: ");
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();
		
		media = (n1 + n2 + n3)/3;
		if (media < 5) {
			System.out.printf("ALUNO REPROVADO | MEDIA: %.1f", media);
		} else if (media >= 5 && media < 6) {
			System.out.println("ALUNO DE RECUPERAÇÃO | DIGITE SUA NOTA NA ATIVIDADE DE RECUPERAÇÃO: ");
			rec = scan.nextDouble();
			if ((media + rec) / 2 < 6) {
				System.out.printf("ALUNO REPROVADO | MEDIA: %.1f", (media + rec) / 2);
			} else {
				System.out.printf("ALUNO APROVADO | MEDIA: %.1f", (media + rec) / 2);
			}
		} else {
			System.out.printf("ALUNO APROVADO | MEDIA: %.1f", media);
		}
		scan.close();
	}

}
