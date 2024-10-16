package exerciciosEnzinguita;
import java.util.Scanner;
public class Exercicio1prova {

    public static void main(String[] args) {
        //Função do programa: calcular a porcentagem da média de nota dos alunos para aplicar como forma de desconto na mensalidade.

        Scanner scan = new Scanner(System.in);
        double n1, n2, media, porcMedia;
        char resp;

        System.out.println("Informe suas notas para saber seu desconto na mensalidade[valor da mensalidade: R$2500]: ");
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();

        media = (n1+n2)/2;

        if (media > 6){
            System.out.println("Parabéns, você ficou acima da média!");
        } else {
            System.out.println("Você ficou abaixo da média, portanto ficou de recuperação. Digite a nota da prova de recuperação: ");
            media = scan.nextDouble();
        }

        porcMedia = (media*100)/10;
        System.out.printf("PORCENTAGEM DA MÉDIA: %.2f%% \nCaso sua porcentagem seja menor com a nota da recuperação há a possibilidade de usar a porcentagem com as notas anteriores para calcular o desconto.\n", porcMedia);
        System.out.println("Deseja fazer isso? [s/n]"); 
        resp = scan.next().charAt(0);

        if (resp == 's'){
            porcMedia = (((n1+n2)/2)*100) / 10;
        }
        System.out.println("O valor da sua mensalidade é de R$2500 menos o valor da porcentagem da sua média.");
        System.out.printf("PORCENTAGEM FINAL DA MÉDIA: %.2f%%", porcMedia);

        scan.close();
    }
    
}