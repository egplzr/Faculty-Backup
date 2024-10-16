package lista3;

import java.util.Scanner;

public class exeeeeeer {
	public static void main(String[] args) {
		// ex5();
		// ex6();
		// ex7();
		// ex8();
		// ex9();
		// ex10();
		// ex11();
		// ex12();
		// ex13();
		// ex14();
		// ex15();
		// ex16();
		// ex17();
	}

	public static void ex5() {
		int soma = 0;
		int termo = 5;

		for (int i = 1; i <= 15; i++) {
			soma += termo;
			termo += 5;
		}
		System.out.println("A soma dos primeiros 15 elementos da sequência resulta em: " + soma);
	}

	public static void ex6() {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o primeiro elemento da sequência: ");
		int primeiroEleme = leia.nextInt();

		System.out.print("Digite o elemento final da sequência: ");
		int ultimoEleme = leia.nextInt();

		int soma = 0;

		for (int i = primeiroEleme; i <= ultimoEleme; i += 5) {
			soma += i;
		}
		System.out.println("A soma dos elementos entre " + primeiroEleme + " e " + ultimoEleme + " é: " + soma);
		leia.close();
	}

	public static void ex7() {
		double salarioIni = 1000.0;
		double perAumento = 0.015;
		double salAtual = salarioIni * (1 + perAumento);

		for (int ano = 2012; ano <= 2023; ano++) {
			perAumento *= 2;
			salAtual *= (1 + perAumento);
		}
		System.out.printf("O salário atual do funcionário é R$ %.2f.", salAtual);
	}

	public static void ex8() {
		double a = 3000.0;
		// a = salário de Carlos
		double b = a / 3;
		// b = salário de João
		int c = 0;
		// c = meses

		while (a >= b) {
			a += a * 0.02;
			b += b * 0.05;
			c++;
		}

		System.out.println(
				" Serão necessários " + c + " meses para que João tenha um salário igual ou superior ao de Carlos. ");
	}

	public static void ex9() {
		Scanner leia = new Scanner(System.in);
		int somaPositivos = 0;
		int quantidadeNegativos = 0;
		int numero;

		while (true) {
			System.out.println("Digite um número (0 para sair): ");
			numero = leia.nextInt();

			if (numero == 0) {
				break;
			} else if (numero > 0) {
				somaPositivos += numero;
			} else {
				quantidadeNegativos++;
			}
		}

		System.out.println("A soma dos números positivos é: " + somaPositivos);
		System.out.println("A quantidade de números negativos é: " + quantidadeNegativos);

		leia.close();
	}

	public static void ex10() {
		Scanner not = new Scanner(System.in);
		double nota;

		do {
			System.out.print("Insira a nota do aluno (entre 0 e 10): ");
			nota = not.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida! Insira uma nota válida.");
			}
		} while (nota < 0 || nota > 10);

		if (nota >= 6) {
			System.out.println("O aluno está APROVADO!");
		} else if (nota >= 5) {
			System.out.println("O aluno está em RECUPERAÇÃO!");
		} else {
			System.out.println("O aluno está REPROVADO!");
		}

		not.close();
	}

	public static void ex11() {
		Scanner men = new Scanner(System.in);
		int opcao;
		double salario = 0;

		do {
			System.out.println("----- Menu de opções -----");
			System.out.println("1. Imposto");
			System.out.println("2. Novo salário");
			System.out.println("3. Classificação");
			System.out.println("4. Finalizar o programa");
			System.out.print("Digite a opção desejada: ");
			opcao = men.nextInt();

			switch (opcao) {
			case 1:
			case 2:
			case 3:
				if (opcao != 4) {
					System.out.print("Insira salário do funcionário: ");
					salario = men.nextDouble();
				}

				switch (opcao) {
				case 1:
					System.out.println("Imposto: "
							+ (salario <= 1500 ? salario * 0.05 : (salario <= 3000 ? salario * 0.10 : salario * 0.15)));
					break;
				case 2:
					System.out.println("Novo salário: " + (salario > 4500 ? salario + 250
							: (salario > 3000 ? salario + 200 : (salario > 2000 ? salario + 150 : salario + 130))));
					break;
				case 3:
					System.out.println("Classificação: " + (salario > 3000 ? "Bem remunerado" : "Mal remunerado"));
					break;
				}
				break;
			case 4:
				System.out.println("Finalizando o programa...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 4);

		men.close();

	}

	public static void ex12() {
		Scanner leia = new Scanner(System.in);

		double valorBase = 0;
		int categoriaConsumidor = 0;
		double valorKw = 0;
		double valorTotalConta = 0;
		double receitaTotal = 0;
		int numConsumidoresFaixa500a1000 = 0;

		System.out.print("Informe o valor base: ");
		// receber valor base
		valorBase = leia.nextDouble();
		valorKw = valorBase / 10;

		while (true) {
			System.out.print("Informe a quantidade de kW utilizada pelo consumidor (0 para encerrar): ");
			double kw = leia.nextDouble();
			if (kw == 0) {
				break;
			}

			System.out.print("Informe a categoria do consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
			categoriaConsumidor = leia.nextInt();

			valorTotalConta = kw * valorKw;
			switch (categoriaConsumidor) {
			case 1:
				valorTotalConta *= 1.05;
				break;
			case 2:
				valorTotalConta *= 1.1;
				break;
			case 3:
				valorTotalConta *= 1.15;
				break;
			}

			receitaTotal += valorTotalConta;
			if (valorTotalConta >= 500 && valorTotalConta <= 1000) {
				numConsumidoresFaixa500a1000++;
			}
		}

		System.out.println("Valor de cada kW: R$" + valorKw);
		System.out.println("Receita total da empresa: R$" + receitaTotal);
		System.out.println(
				"Número de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + numConsumidoresFaixa500a1000);

		leia.close();
	}

	public static void ex13() {
		Scanner num = new Scanner(System.in);

		System.out.print("Informe o número de elementos da série: ");
		int numElementos = num.nextInt();

		int elemento1 = 2;
		int elemento2 = 7;
		int elemento3 = 3;

		System.out.print(elemento1 + " ");
		System.out.print(elemento2 + " ");
		System.out.print(elemento3 + " ");

		for (int i = 4; i <= numElementos; i++) {
			int novoElemento;
			if (i % 3 == 0) {
				novoElemento = elemento3 * 4;
				elemento3 = novoElemento;
			} else if (i % 3 == 1) {
				novoElemento = elemento1 * 3;
				elemento1 = novoElemento;
			} else {
				novoElemento = elemento2 * 2;
				elemento2 = novoElemento;
			}
			System.out.print(novoElemento + " ");
		}

		num.close();
	}

	public static void ex14() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabuada do " + i + ":");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

	public static void ex15() {
		int quantTimes = 5;
		int quantJogadores = 15;
		Scanner ida = new Scanner(System.in);

		int jogadoresMen18 = 0;
		int jogadoresMai80Kg = 0;
		double mediaAltura = 0;

		for (int indiceTime = 0; indiceTime < quantTimes; indiceTime++) {
			int somaIdades = 0;
			System.out.println("Time " + (indiceTime + 1) + ":");
			for (int indiceJogador = 0; indiceJogador < quantJogadores; indiceJogador++) {
				System.out.println("Jogador " + (indiceJogador + 1) + ":");
				System.out.print("Idade: ");
				int idadeJogador = ida.nextInt();
				somaIdades += idadeJogador;

				System.out.print("Peso: ");
				int pesoJogador = ida.nextInt();
				if (idadeJogador < 18) {
					jogadoresMen18++;
				}
				if (pesoJogador > 80) {
					jogadoresMai80Kg++;
				}

				System.out.print("Altura: ");
				double alturaJogador = ida.nextDouble();
				mediaAltura += alturaJogador;
			}

			double mediaIdadeTime = (double) somaIdades / quantJogadores;
			System.out.println("Média de idade do Time " + (indiceTime + 1) + ": " + mediaIdadeTime);
		}

		mediaAltura /= (quantTimes * quantJogadores);
		double percentMaior80Kg = ((double) jogadoresMai80Kg / (quantTimes * quantJogadores)) * 100;

		System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAltura);
		System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMen18);
		System.out.println("Percentual de jogadores com mais de 80 Kg: " + percentMaior80Kg + "%");

		ida.close();
	}

	public static void ex16() {
		Scanner leia = new Scanner(System.in);

		int valorMax = Integer.MIN_VALUE;
		int valorMin = Integer.MAX_VALUE;
		int numero;

		System.out.print("Digite um número inteiro positivo (ou um número negativo para encerrar): ");
		numero = leia.nextInt();

		while (numero >= 0) {
			if (numero > valorMax) {
				valorMax = numero;
			}
			if (numero < valorMin) {
				valorMin = numero;
			}

			System.out.print("Insira um número inteiro positivo (ou um número negativo para encerrar): ");
			numero = leia.nextInt();
		}

		System.out.println("O maior número inserido foi: " + valorMax);
		System.out.println("O menor número inserido foi: " + valorMin);

		leia.close();
	}

	public static void ex17() {
		Scanner leia = new Scanner(System.in);

		int menorNumero = Integer.MAX_VALUE;
		int maiorNumero = Integer.MIN_VALUE;
		int somaTotal = 0;
		int NumerosPares = 0;
		int DivPor5 = 0;

		for (int indice = 0; indice < 15; indice++) {
			System.out.print("Digite o número " + (indice + 1) + ": ");
			int numero = leia.nextInt();

			if (numero < menorNumero) {
				menorNumero = numero;
			}

			if (numero > maiorNumero) {
				maiorNumero = numero;
			}

			somaTotal += numero;

			if (numero % 2 == 0) {
				NumerosPares++;
			}

			if (numero % 5 == 0) {
				DivPor5++;
			}
		}

		double media = (double) somaTotal / 15;

		System.out.println("Menor número inserido: " + menorNumero);
		System.out.println("Maior número inserido: " + maiorNumero);
		System.out.println("Média dos números inseridos: " + media);
		System.out.println("Quantidade de números pares: " + NumerosPares);
		System.out.println("Quantidade de números divisíveis por 5: " + DivPor5);

		leia.close();
	}
}
