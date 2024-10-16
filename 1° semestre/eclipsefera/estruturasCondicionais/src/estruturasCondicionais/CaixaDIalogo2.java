package estruturasCondicionais;
import javax.swing.JOptionPane;
public class CaixaDIalogo2 {

	public static void main(String[] args) {
		int n1, n2, n3;
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 1° número", "Informe", JOptionPane.QUESTION_MESSAGE));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 2° número", "Informe", JOptionPane.QUESTION_MESSAGE));
		n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inoforme o 3° número", "Informe", JOptionPane.QUESTION_MESSAGE));
		if (n1 > n2 && n1 > n3) {
			JOptionPane.showMessageDialog(null, "O 1° número é o maior: " +n1);
		} else if (n2 > n1 && n2 > n3) {
			JOptionPane.showMessageDialog(null, "O 2° número é o maior: " +n2);
		} else if (n3 > n1 && n3 > n2) {
			JOptionPane.showMessageDialog(null, "O 3° número é o maior: " +n3);
		} else if (n1 == n2 && n2 == n3) {
			JOptionPane.showMessageDialog(null, "Os números são iguais: " +n1+ " | " +n2+ " | " +n3);
		}
		
	}

}
