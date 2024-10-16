package lista2;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		/*
		 * Você foi solicitado a criar um programa para acompanhamento de peso, no qual
		   através do peso e da altura calcula-se o IMC. Após o cálculo, deverá ser informada
		   a classificação, conforme tabela abaixo. (IMC = Peso / Altura²)
									
									IMC Classificação
							Menor ou igual a 16 Magreza Severa
							Entre 16 e 17 Magreza Moderada
							Entre 17 e 18.5 Magreza Leve
							Entre 18.5 e 25 Normal
							Entre 25 e 30 Obesidade Leve
							Entre 30 e 40 Obesidade Severa
							Acima de 40 Obesidade Mórbida 
		 */

		double peso, alt, imc;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu peso e sua altura[kg (xx,xx) / metro, centímetro (x,xx)]: ");
		peso = scan.nextDouble();
		alt = scan.nextDouble();
		scan.close();
		
		imc = peso / (alt * alt);
		
		if (imc <= 16) {
            System.out.printf("\n IMC: %.2f | Magreza Severa", imc);
            
        } else if (imc > 16 && imc <= 17) {
        	System.out.printf("\n IMC: %.2f | Magreza Moderada", imc);
        	
        } else if (imc > 17 && imc <= 18.5) {
        	System.out.printf("\n IMC: %.2f | Magreza Leve", imc);
        	
        } else if (imc > 18.5 && imc <= 25) {
        	System.out.printf("\n IMC: %.2f | Normal", imc);
        	
        } else if (imc > 25 && imc <= 30) {
        	System.out.printf("\n IMC: %.2f | Obesidade Leve", imc);
        	
        } else if (imc > 30 && imc <= 40) {
        	System.out.printf("\n IMC: %.2f | Obesidade Severa", imc);
        	
        } else {
        	System.out.printf("\n IMC: %.2f | Obesidade Mórbida", imc);
        	
        }
	}

}
