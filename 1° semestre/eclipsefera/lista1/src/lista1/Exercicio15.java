package lista1;
import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double saco, unPorcao, resto, qntdPorcao, dias;
		System.out.print("Digite o peso do saco de ração em kg: ");
		saco = scan.nextDouble();
		System.out.print("Digite o peso da porção em g: ");
		unPorcao = scan.nextDouble();
		resto = (saco*1000) / unPorcao;
		System.out.print("Digite quantas porções serão servidas por dia: ");
		qntdPorcao = scan.nextDouble();
		dias = resto - 5*qntdPorcao;
		saco = dias*unPorcao - saco;
		scan.close();
		System.out.printf("Após 5 dias restarão %.0f porções ou %.0f gramas de ração.", dias, saco);
	}

}
