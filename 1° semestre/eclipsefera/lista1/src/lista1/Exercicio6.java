package lista1;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sal, grati, desc, nSal;
		System.out.println("Digite seu salário bruto: ");
		sal = scan.nextDouble();
		grati = sal * 10/100;
		desc = (sal + grati) * 15/100;
		nSal = (sal + grati) - desc;
		scan.close();
		System.out.printf(" %4.2f - SALARIO LIQUIDO \n %4.2f - GRATIFICACAO \n %4.2f - DESCONTO", nSal, grati, desc);
	}

}
