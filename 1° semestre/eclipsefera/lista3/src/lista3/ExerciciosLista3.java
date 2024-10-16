package lista3;

import java.util.Scanner;
import java.util.Random;

public class ExerciciosLista3 {

	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {

		// ex1();
		// ex2();
		// ex3();
		// ex4();
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
		 ex17();
	}

	public static void ex1() {

		int num = 51;

		do {
			System.out.println(num);
			num += 3;
		} while (num < 9500);
	}

	public static void ex2() {

		for (int num = 1; num <= 250; num++) {
			if (num % 10 == 0) {
				System.out.println(num + "múltiplo de dez");
			} else {
				System.out.println(num);
			}
		}
	}

	public static void ex3() {

		int soma = 0;
		for (int num = 1; num <= 100; num++) {
			soma += num;
		}
		System.out.println(soma);
	}

	public static void ex4() {

		int num;
		System.out.println("Digite um limite para o somatório: ");
		num = scan.nextInt();

		int soma = 0, i = 1;
		for (i = 1; i <= num; i++) {
			soma += i;
		}
		System.out.println(soma);
	}

	public static void ex5() {

		int soma = 0, i = 1;
		for (i = 0; i <= 15; i++) {
			System.out.println(soma);
			soma += 5;
		}
	}

	public static void ex6() {
		int i, limite;

		System.out.println("digite o primeiro e o último termo da contagem: ");
		i = scan.nextInt();
		limite = scan.nextInt();

		do {
			System.out.println(i);
			i += 5;

		} while (i <= limite);
	}

	public static void ex7() {
		double aumento, percentual = 0.015, sal = 1000;
		int i = 1;
		do {
			System.out.println(sal);
			aumento = sal * percentual;
			sal += aumento;
			percentual *= 2;
			i++;
		} while (i <= 14);
	}

	public static void ex8() {
		double salCarlos, salJoao, aplicCarlos = 0.02, aplicJoao = 0.05;
		int qMeses = 0;

		System.out.println("Digite o salário do Carlos: ");
		salCarlos = scan.nextDouble();

		salJoao = salCarlos / 3;
		do {
			salCarlos += (salCarlos * aplicCarlos);
			salJoao += (salJoao * aplicJoao);
			qMeses++;
		} while (salCarlos >= salJoao);
		System.out.println("A quantscande de meses necessária para joão alcançar foi de: " + qMeses);

	}

	public static void ex9() {
		int[] numeros = new int[99999];
		int somaDosPositivos = 0, contNegativos = 0;

		for (int i : numeros) {
			System.out.println("Digite um número: ");
			numeros[i] = scan.nextInt();
			if (numeros[i] > 0) {
				somaDosPositivos += numeros[i];
			} else if (numeros[i] < 0 && numeros[i] != 0) {
				contNegativos++;
			}
			if (numeros[i] == 0) {
				System.out.printf("SOMA DOS N° POSITIVOS: %d \nQUANTscanDE DE N° NEGATIVOS: %d", somaDosPositivos,
						contNegativos);
				break;
			}
		}
	}

	public static void ex10() {
		double nota;

		do {
			System.out.println("Informe sua nota [0 a 10]: ");
			nota = scan.nextDouble();
			if (nota > 10 || nota < 0) {
				System.out.println("VALORES INVÁLIDOS, DIGITE UMA NOTA VÁLscan [0 a 10]\n");
				continue;
			} else if (nota <= 10 && nota >= 0) {
				if (nota >= 6) {
					System.out.println("Aprovado.");
				} else if (nota < 6 && nota >= 5) {
					System.out.println("Recuperação.");
				} else if (nota < 5) {
					System.out.println("Reprovado.");
				}
				break;
			}

		} while (true);
	}

	public static void ex11() {
		int opcao;
		double sal;

		System.out.println("----- Menu de opções -----");
		System.out.println(" 1. Imposto");
		System.out.println(" 2. Novo salário");
		System.out.println(" 3. Classificação");
		System.out.println(" 4. Finalizar o programa");
		System.out.println(" Digite a opção desejada.");
		System.out.println("-----------------------------------");
		opcao = scan.nextInt();

		System.out.println("Digite seu salário: ");
		sal = scan.nextDouble();

		switch (opcao) {
		case 1:
			double imposto;

			if (sal <= 1500) {
				imposto = sal * 0.05;
				sal -= imposto;
				System.out.printf("Valor do imposto: %.2f | Valor do salário: %.2f", imposto, sal);
			} else if (sal > 1500 && sal <= 3000) {
				imposto = sal * 0.10;
				sal -= imposto;
				System.out.printf("Valor do imposto: %.2f | Valor do salário: %.2f", imposto, sal);
			} else if (sal > 3000) {
				imposto = sal * 0.15;
				sal -= imposto;
				System.out.printf("Valor do imposto: %.2f | Valor do salário: %.2f", imposto, sal);
			}

		case 2:
			double aumento;

			if (sal > 4500) {
				aumento = 250;
				sal += aumento;
				System.out.printf("Valor do aumento: %.2f | Valor do salário: %.2f", aumento, sal);
			} else if (sal > 3000 && sal < 4500) {
				aumento = 200;
				sal += aumento;
				System.out.printf("Valor do aumento: %.2f | Valor do salário: %.2f", aumento, sal);
			} else if (sal > 2000 && sal < 3000) {
				aumento = 150;
				sal += aumento;
				System.out.printf("Valor do aumento: %.2f | Valor do salário: %.2f", aumento, sal);
			} else if (sal < 2000) {
				aumento = 130;
				sal += aumento;
				System.out.printf("Valor do aumento: %.2f | Valor do salário: %.2f", aumento, sal);
			}

		case 3:
			if (sal > 3000) {
				System.out.println("Bem remunerado.");
			} else {
				System.out.println("Mal remunerado");
			}

		default:
			System.out.println("PROGRAMA FINALIZADO.");
		}
	}

	public static void ex12() {
		double valorBase = 0, valorKw = 0, tConta = 0, receitaTotal = 0;
		int categoriaConsumidor = 0, nConsumidores = 0;

		System.out.print("Informe o valor base: ");
		valorBase = scan.nextDouble();
		valorKw = valorBase / 10;

		while (true) {
			System.out.print("Informe a quantscande de kW utilizada pelo consumidor (0 para encerrar): ");
			double kw = scan.nextDouble();
			if (kw == 0) {
				break;
			}

			System.out.print("Informe a categoria do consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
			categoriaConsumidor = scan.nextInt();

			tConta = kw * valorKw;
			switch (categoriaConsumidor) {
			case 1:
				tConta *= 1.05;
				break;
			case 2:
				tConta *= 1.1;
				break;
			case 3:
				tConta *= 1.15;
				break;
			}

			receitaTotal += tConta;
			if (tConta >= 500 && tConta <= 1000) {
				nConsumidores++;
			}
		}

		System.out.println("Valor de cada kW: R$" + valorKw);
		System.out.println("Receita total da empresa: R$" + receitaTotal);
		System.out.println("Número de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + nConsumidores);

	}

	public static void ex13() {

		System.out.print("Informe o número de elementos da série: ");
		int nElementos = scan.nextInt();
		int e1 = 2, e2 = 7, e3 = 3;

		System.out.print(e1 + " ");
		System.out.print(e2 + " ");
		System.out.print(e3 + " ");

		for (int i = 4; i <= nElementos; i++) {
			int novoElemento;
			if (i % 3 == 0) {
				novoElemento = e3 * 4;
				e3 = novoElemento;
			} else if (i % 3 == 1) {
				novoElemento = e1 * 3;
				e1 = novoElemento;
			} else {
				novoElemento = e2 * 2;
				e2 = novoElemento;
			}
			System.out.print(novoElemento + " ");
		}

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

		int jMenor18 = 0;
		int jMais80Kg = 0;
		double mediaAlt = 0;

		for (int indiceTime = 0; indiceTime < quantTimes; indiceTime++) {
			int somascandes = 0;
			System.out.println("Time " + (indiceTime + 1) + ":");
			for (int indiceJogador = 0; indiceJogador < quantJogadores; indiceJogador++) {
				System.out.println("Jogador " + (indiceJogador + 1) + ":");
				System.out.print("scande: ");
				int scandeJogador = scan.nextInt();
				somascandes += scandeJogador;

				System.out.print("Peso: ");
				int pesoJogador = scan.nextInt();
				if (scandeJogador < 18) {
					jMenor18++;
				}
				if (pesoJogador > 80) {
					jMais80Kg++;
				}

				System.out.print("Altura: ");
				double alturaJogador = scan.nextDouble();
				mediaAlt += alturaJogador;
			}

			double mediascandeTime = (double) somascandes / quantJogadores;
			System.out.println("Média de scande do Time " + (indiceTime + 1) + ": " + mediascandeTime);
		}

		mediaAlt /= (quantTimes * quantJogadores);
		double percentMaior80Kg = ((double) jMais80Kg / (quantTimes * quantJogadores)) * 100;

		System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAlt);
		System.out.println("Quantscande de jogadores com scande inferior a 18 anos: " + jMenor18);
		System.out.println("Percentual de jogadores com mais de 80 Kg: " + percentMaior80Kg + "%");

	}
	
	public static void ex16() {

		int valorMax = Integer.MIN_VALUE, valorMin = Integer.MAX_VALUE, num;

		System.out.print("Digite um número inteiro positivo (negativo para encerrar o programa): ");
		num= scan.nextInt();

		while (num>= 0) {
			if (num> valorMax) {
				valorMax = num;
			}
			if (num< valorMin) {
				valorMin = num;
			}

			System.out.print("Insira um número inteiro positivo (negativo para encerrar o programa): ");
			num= scan.nextInt();
		}

		System.out.println("O maior número inserido foi: " + valorMax);
		System.out.println("O menor número inserido foi: " + valorMin);
	}
	
	public static void ex17() {

		int menorNum = Integer.MAX_VALUE;
		int maiorNum = Integer.MIN_VALUE;
		int soma = 0, NumPares = 0, DivPor5 = 0;

		for (int indice = 0; indice < 15; indice++) {
			System.out.print("Digite o número " + (indice + 1) + ": ");
			int numero = scan.nextInt();

			if (numero < menorNum) {
				menorNum = numero;
			}

			if (numero > maiorNum) {
				maiorNum = numero;
			}

			soma += numero;

			if (numero % 2 == 0) {
				NumPares++;
			}

			if (numero % 5 == 0) {
				DivPor5++;
			}
		}

		double media = (double) soma / 15;

		System.out.println("Menor número inserido: " + menorNum);
		System.out.println("Maior número inserido: " + maiorNum);
		System.out.println("Média dos números inseridos: " + media);
		System.out.println("Quantidade de números pares: " + NumPares);
		System.out.println("Quantidade de números divisíveis por 5: " + DivPor5);

	}
	
}
