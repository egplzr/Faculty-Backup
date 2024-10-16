package estruturasCondicionais;
import javax.swing.JOptionPane;


public class CaixaDialogo {

	public static void main(String[] args) {
		int n1, n2;
		/*
		 * Integer.parseInt -> converte de string para int
		 */
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o n°1", "informe", JOptionPane.QUESTION_MESSAGE));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o n°2", "informe", JOptionPane.QUESTION_MESSAGE));
		if (n1 > n2) {
			JOptionPane.showMessageDialog(null, "Número 1: "+ n1+" é o maior");
		} else if (n1 < n2) {
			JOptionPane.showMessageDialog(null, "Número 2: "+ n2+" é o maior");
		} else {
			JOptionPane.showMessageDialog(null, "Os números são iguais");
		}
		
	}

}
