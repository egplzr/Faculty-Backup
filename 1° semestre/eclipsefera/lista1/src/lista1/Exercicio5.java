package lista1;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		double sal, nSal, porcentagem;
		System.out.println("Digite o seu nome: ");
		nome = scan.nextLine();
		System.out.println("Digite seu salário: ");
		sal = scan.nextDouble();
		porcentagem = sal * 25/100;
		nSal = sal + porcentagem;		
		System.out.printf(" %s, parabéns! \n Você recebeu um aumento de 25%%, seu novo salário é: %4.2f", nome, nSal);
		scan.close();
	}

}
