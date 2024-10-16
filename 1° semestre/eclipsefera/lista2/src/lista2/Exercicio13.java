package lista2;
import javax.swing.JOptionPane;
public class Exercicio13 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que receba um ano e informe se este ano é bissexto ou não. Caso
		   não seja um ano bissexto, o algoritmo deverá informar qual o próximo ano bissexto
		   depois do ano informado.
		 */
		
		int ano;
		
		ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um ano para saber se é bissexto", "Informe:", JOptionPane.QUESTION_MESSAGE));
		
		if (ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {
			JOptionPane.showMessageDialog(null, "O ano digitado é bissexto. ANO: "+ ano);	
		} else {
			ano = ano + (4 - (ano%4));
			JOptionPane.showMessageDialog(null, "O ano informado não é bissexto. O próximo ano bissexto é: "+ano);
		}
	}

}
