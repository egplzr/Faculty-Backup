package ago20;

import javax.swing.*;

public class Main {
    public static void ex1(){
        //Exercício de array passado em slide;

        double[] temp = new double[7];
        double soma = 0, media = 0;
        int countAcima = 0, countAbaixo = 0;
        for (int i = 0; i < temp.length; i++){
            temp[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a média diária de temperatura do "+i+"° dia:"));
            soma += temp[i];
        }

        media = soma / temp.length;

        for (int i = 0; i < temp.length; i++){
            if (temp[i] >= media){
                countAcima++;
            } else {
                countAbaixo++;
            }
        }

        System.out.printf("A média de temperaturas durante os sete dias foi %.2f\nDias acima de média: %d\nDias abaixo da média: %d", media, countAcima, countAbaixo);

    }

    public static void testeVetor() throws Exception {
        Vetor v = new Vetor(3);
        v.adicionar("24");
        v.adicionar("Enzo");
        v.adicionar("Teste");
        System.out.println(v.tamanho());

        System.out.println(v.toString());
    }

    public static void main(String[] args) throws Exception {
        //ex1();
        testeVetor();
    }
}
