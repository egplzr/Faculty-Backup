package vetoresMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Avaliacao2 {

	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// ex1();
		ex2();
	}

	public static void ex1() {
		int alunosManha = 0, alunosNoite = 0;
		int alunosIdade = 0, alunos20menos = 0;
		int alunosSuperior = 0;
		int alunosEmpregados = 0;

		double mediaIdade, porcentagemEmpregados;

		for (int i = 0; i < 500; i++) {
			// informar período 1 = manhã, 0 = noite.
			int periodo = rand.nextInt(2);
			if (periodo == 1) {
				alunosManha++;
			} else {
				alunosNoite++;
			}

			// Idade dos alunos. (contador menor igual a 20)
			int idade = rand.nextInt(18, 51);
			alunosIdade += idade;
			if (idade <= 20) {
				alunos20menos++;
			}

			// Alunos formados em nivel superior 1 = sim, 0 = não.
			int nivel = rand.nextInt(2);
			if (nivel == 1) {
				alunosSuperior++;
			}

			// Alunos empregados 1 = sim, 0 = não.
			int empregado = rand.nextInt(2);
			if (empregado == 1) {
				alunosEmpregados++;
			}

		}

		mediaIdade = alunosIdade / 500;

		porcentagemEmpregados = (alunosEmpregados * 100) / 500;

		String resultadoPesquisa = """
					RESULTADO DA PESQUISA:

					Quantidade de aluno no período da manhã: %d
					Quantidade de aluno no período da noite: %d
									--//--
					Quantidade de alunos com menos de 20 anos: %d
					Media de idade dos alunos: %.2f
									--//--
					Quantidade de alunos já formados em nível superior: %d
					Percentual de alunos empregados: %.2f%%
				""".formatted(alunosManha, alunosNoite, alunos20menos, mediaIdade, alunosSuperior,
				porcentagemEmpregados);

		System.out.println(resultadoPesquisa);
	}

	public static void ex2() {
		System.out.println("Digite o número de linhas e colunas para o Array bidimensional: ");
		int l = scan.nextInt();
		int c = scan.nextInt();
		int[][] array = new int[l][c];
		ex2ExibirMatriz(array);
	}

	public static void ex2ExibirMatriz(int[][] array) {
		int linha;
		int coluna;
		System.out.print("");
		for (linha = 0; linha < array.length; linha++) {
			if (linha == 0) {
				System.out.print("+");
			} else if (linha == array.length - 1) {
				System.out.print("+");
			} else if (linha < 1 || linha < array.length - 1){
				System.out.print("|");
			} 

			for (coluna = 0; coluna < array[linha].length; coluna++) {
				if (coluna == array[linha].length - 1 && linha == 0) {
					System.out.print("+");
				} else if (coluna == array[linha].length - 1 && linha == array.length - 1) {
					System.out.print("+");
				} else if (linha == 0 && coluna < array[linha].length - 1){
					System.out.print("-");
				} else if (linha == array.length - 1 && coluna < array[linha].length - 1){
					System.out.print("-");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("|");
			

		}
	}

}
