/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ago14;

import javax.swing.JOptionPane;

/**
 *
 * @author enzo.gpelizaro
 */
public class CadastroAluno {

    public static void main(String[] args) {
        int resp = 0;

        do {
            String ra = JOptionPane.showInputDialog("Digite o RA: ");
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1° nota: "));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2° nota: "));

            Aluno aluno = new Aluno();
            aluno.setRa(ra);
            aluno.setNome(nome);
            aluno.setNota1(nota1);
            aluno.setNota2(nota2);

            aluno.imprimir();
            
            resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        } while (resp == 0);
    }
}
