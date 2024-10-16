package switchCase;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ope;
		
		System.out.println("Digite o n° da operação que deseja realizar: ");
		System.out.printf("    1 - Área do triângulo. \n    2 - Velocidade Media. \n    3 - Conversão milímetro p/ polegada. \n    4 - Conversão Celcius para Kelvin \n    5 - Área do círculo.");
		ope = scan.nextInt();
		
		switch (ope) {
		case 1:
			double area, b, h;
			
			System.out.println("OPERAÇÃO ESCOLHIDA: ÁREA DO TRIÃNGULO.\nINFORME O VALOR DA BASE E DA ALTURA:");
			b = scan.nextDouble();
			h = scan.nextDouble();
			
			area = (b*h)/2;
			
			System.out.printf("VALOR DA ÁREA: %10.2f", area);
			break;
		case 2: 
			double vm, e, t;
			
			System.out.println("OPERAÇÃO ESCOLHIDA: VELOCIDADE MÉDIA.\nINFORME O VALOR DO ESPAÇO E DO TEMPO:");
			e = scan.nextDouble();
			t = scan.nextDouble();
			
			vm = e/t;
			
			System.out.printf("VELOCIDADE MÉDIA: %10.2f", vm);
			break;
		case 3:
			double mm, pol;
			
			System.out.println("OPERAÇÃO ESCOLHIDA: CONVERSÃO mm p/ POL.\nINFORME O VALOR DA MEDIDA EM mm:");
			mm = scan.nextDouble();
			
			pol = mm/25.4;
			
			System.out.printf("MEDIDA EM POL: %10.2f", pol);
			break;
		case 4: 
			double c, k;
			
			System.out.println("OPERAÇÃO ESCOLHIDA: C p/ K.\nINFORME O VALOR DA TEMPERATURA EM C:");
			c = scan.nextDouble();
			
			k = c + 273.15;
			
			System.out.printf("TEMPERATURA EM KELVIN: %10.2f °K", k);
			break;
		case 5:
			double a, r;
			System.out.println("OPERAÇÃO ESCOLHIDA: ÁREA DO CÍRCULO.\nINFORME O VALOR DO RAIO:");
			r = scan.nextDouble();
			
			a = Math.PI*Math.pow(r, 2);
			
			System.out.printf("VALOR DA ÁREA: %10.2f", a);
			break;
		}
		scan.close();
	}

}
