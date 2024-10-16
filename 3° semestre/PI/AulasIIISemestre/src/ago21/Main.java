package ago21;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pessoa p1  = new Pessoa(JOptionPane.showInputDialog("Digite o nome: "), JOptionPane.showInputDialog("Digite o endereço: "),
                Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));

        System.out.printf("Nome: %s, Idade: %d, Endereço: %s", p1.getNome(), p1.getIdade(), p1.getEndereco());
    }
}
