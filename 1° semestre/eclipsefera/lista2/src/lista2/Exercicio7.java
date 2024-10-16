package lista2;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que calcule o salário líquido de acordo com as orientações a
		   seguir:
				a) Receber o salário base e gratificação via teclado;
				b) Salário bruto será a soma do salário base com a gratificação;
				c) Se o salário bruto for inferior a R$ 2500,00 incidirá um imposto de 10%, caso
				   contrário 15%;
				d) Exibir o salário bruto, a gratificação, o imposto e o salário líquido.
		 */
		
		double salBase, grat, salBruto, salLiq;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salário base e gratificação: ");
		salBase = scan.nextDouble();
		grat = scan.nextDouble();
		scan.close();
		
		salBruto = salBase + grat;
		
		if (salBruto < 2500) {
			salLiq = salBruto - (salBruto * 0.10);
			System.out.printf("\n SALÁRIO BRUTO: %19.2f \n GRATIFICAÇÃO: %20.2f \n IMPOSTO(10%%): %20.2f \n SALÁRIO LÍQUIDO: %17.2f", salBruto, grat, salBruto * 0.10, salLiq );
			
		} else {
			salLiq = salBruto - (salBruto * 0.15);
			System.out.printf("\n SALÁRIO BRUTO: %19.2f \n GRATIFICAÇÃO: %20.2f \n IMPOSTO(15%%): %20.2f \n SALÁRIO LÍQUIDO: %17.2f", salBruto, grat, salBruto * 0.15, salLiq );

		}
	}

}
