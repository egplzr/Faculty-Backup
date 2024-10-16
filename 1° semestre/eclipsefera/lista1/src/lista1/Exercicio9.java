package lista1;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio, area, perimetro;
		System.out.println("Vamos calcular a area e o perimetro de um circulo! \n Informe o raio do circulo: ");
		raio = scan.nextDouble();
		area = Math.pow(raio, 2)*Math.PI;
		perimetro = 2*Math.PI*raio;
		scan.close();
		System.out.printf("%4.2f - RAIO \n %4.2f - AREA \n %4.2f - PERIMETRO", raio, area, perimetro);
				
	}

}
