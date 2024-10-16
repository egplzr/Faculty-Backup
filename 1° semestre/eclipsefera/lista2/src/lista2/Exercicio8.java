package lista2;
import javax.swing.JOptionPane;
public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que leia o salário de um funcionário, calcule e mostre seu novo
	       salário acrescido de bonificação e auxílio escola:
	       
							Salário Bonificação
							Abaixo de R$ 2000,00 (inclusive) 10%
							Entre R$ 2000,00 e R$ 3000,00 (inclusive) 8%
							Acima de R$ 3000,00 5%
							
							Salário Auxílio Escola
							Abaixo de R$ 2500,00 (inclusive) R$ 350,00
							Acima de R$ 2500,00 R$ 300,00 
		 */
		
		double sal, nsal, bon, aux;
		
		sal = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe seu salário: ", "Informe: ", JOptionPane.QUESTION_MESSAGE));
		
		if (sal <= 2000) {
			bon = sal * 0.10;
		} else if (sal > 2000 && sal <= 3000) {
			bon = sal * 0.08;
		} else {
			bon = sal * 0.05;
		}
		
		if (sal <= 2500) {
			aux = 350;
		} else {
			aux = 300;
		}
		
		nsal = sal + aux + bon;
		
		JOptionPane.showMessageDialog(null, "O seu novo salário acrescido de bonificação e auxílio escola é: " + nsal);
	}

}
