package lista2;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/*
		 * . 	Em uma escola, os alunos ganham premiações de acordo com o seu desempenho
				ao longo do ano letivo, conforme tabela abaixo:
				
									Prêmio Requisito
					Excursão Nota acima de 80 e 0% de faltas
					Camiseta Nota acima de 80 ou 100% de presença
					Squeeze Nota entre 70 e 80 e pelo menos 90% de presença
					Caneta personalizada Nota entre 70 e 80 ou pelo menos 90% de presença
					
				Baseado na tabela, crie um algoritmo que receba 4 notas de um aluno entre 0 e 100,
				quantidade de aulas dadas, quantidade de presenças e informe qual o prêmio a ser
				recebido pelo aluno. Caso o aluno não esteja em nenhuma das condições da tabela, o
				algoritmo deve informar que não há prêmios. 
		 */
		
		double n1, n2, n3, n4, media, quantAula, presen, porcPresen;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite suas 4 notas [0 a 100] para calcular a média: ");
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();
		n4 = scan.nextDouble();
		System.out.println("Digite quantas aulas foram dadas ao longo do ano e em quantas você esteve presente: ");
		quantAula = scan.nextDouble();
		presen = scan.nextDouble();
		scan.close();
		
		porcPresen = (presen * 100) / quantAula;
		media = (n1 + n2 + n3 + n4)/4;
		if (media > 80 && porcPresen == 100) {
			System.out.println("PARABÉNS! VOCÊ GANHOU UM PRÊMIO: EXCURSÃO.");
		} else if (media > 80 || porcPresen == 100) {
			System.out.println("PARABÉNS! VOCÊ GANHOU UM PRÊMIO: CAMISETA.");
		} else if (media >= 70 && media <= 80 && porcPresen >= 90) {
			System.out.println("PARABÉNS! VOCÊ GANHOU UM PRÊMIO: GARRAFA SQUEEZE.");
		} else if (media >= 70 && media <= 80 || porcPresen >= 90) {
			System.out.println("PARABÉNS! VOCÊ GANHOU UM PRÊMIO: CANETA PERSONALIZADA.");
		} else {
			System.out.println("NÃO HÁ PREMIOS PARA VOCÊ.");
		}
		
	}

}
