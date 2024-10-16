import javax.swing.*;

public class Main {
    //Author: Enzo Guedes Pelizaro
    public static void main(String[] args) {
        Carro c1 = new Carro(JOptionPane.showInputDialog("Digite a marca: "), JOptionPane.showInputDialog("Digite o modelo: "),
                JOptionPane.showInputDialog("Digite a cor: "), Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação: ")));

        int resp = 0;
        int acel = 0;

        resp = JOptionPane.showConfirmDialog(null, "Deseja ligar o carro?");

        if(resp == 0){
            JOptionPane.showMessageDialog(null, c1.ligarCarro());
            while(true) {
                acel = JOptionPane.showConfirmDialog(null, c1.statusCarro() + "\nO carro está ligado.\nAperte [Yes] para acelerar," +
                        " [No] para desacelerar e [Cancel] para desligar o carro.");
                if (acel == 0) {
                    JOptionPane.showMessageDialog(null, c1.acelerar(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade que deseja acelerar(Km/h):"))));
                } else if (acel == 1) {
                    JOptionPane.showMessageDialog(null, c1.desacelerar(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade que deseja desacelerar(Km/h):"))));
                } else {
                    JOptionPane.showMessageDialog(null, c1.desligarCarro());
                    break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, c1.statusCarro() + "\nO carro está desligado.");
        }
    }
}
