package estruturasCondicionais;
import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double n1, n2, media;
		System.out.println("Informe suas notas: ");
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		media = (n1 + n2) / 2;
		if (media < 0 || media > 10) {
			System.out.println("NOTA INVÁLIDA");
		}
		if (media < 2 ) {
			System.out.println("Class: E");
		} else if (media < 4) {
			System.out.println("Class: D");
		} else if (media < 6) {
			System.out.println("Class: C");
		} else if (media < 8) {
			System.out.println("Class: B");
		} else {
			System.out.println("Class: A");
		}
		scan.close();
		/*
		 * Operador ternário: 
		 * <condição> ? <resultadotrue> : <resultadofalse>
		 * Ex: Sysout(nota >= 50 ? "Aprovado" : "Reprovado");
		 * 
		 * Operadores lógicos para strings são diferentes: nomestring.equals("A") // nomestring == "A" -> não funciona.
		 */
	}

}

