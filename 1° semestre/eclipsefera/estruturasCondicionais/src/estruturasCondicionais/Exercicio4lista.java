package estruturasCondicionais;
import java.util.Scanner;
public class Exercicio4lista {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um núemro entre 0 e 100: ");
		n = scan.nextInt();
		scan.close();
		
		if (n >= 0 && n <= 100) {
			System.out.println("Obrigado.");
		} else {
			System.out.println("O número que você digitou não está entre 0 e 100.");
		}
		
		// alternativa: guardar JOptionPane em variaveis do tipo inteiro e apresentar mensagem com alertas diferentes no final.
		
	}

}
