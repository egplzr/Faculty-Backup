package javapoolista;

import java.awt.BorderLayout;
import java.util.Scanner;

/*
 * @author enzo.gpelizaro
 */
public class JavaPOOlista {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n1, n2, n3, n4, tAulas, tFaltas;
        System.out.println("Insira as 4 notas do aluno: ");
        
        n1 = s.nextDouble();
        n2 = s.nextDouble();
        n3 = s.nextDouble();
        n4 = s.nextDouble();
        
        
        
        System.out.println("Informe o total de aulas e o total de faltas do aluno: ");
        
        tAulas = s.nextDouble();
        tFaltas = s.nextDouble();
        
    }
}
