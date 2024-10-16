package exerciciosaula2;

import java.util.Scanner;

/**
 *
 * @author enzo.gpelizaro
 *
 * exercício 7 - sub-rotina com parametro um vetor A com cinco N°s reais e
 * retorne os N°s em ordem crescente
 */

public class Exercicio7Aula2 {

    public static void main(String[] args) {
        int i, n=5;
        int v[] = new int[n];
        Scanner e=new Scanner(System.in);
        for (i = 0; i < n; i++){
            v[i] = e.nextInt();
        }
        ordem(v);
        System.out.println("vetor ordenado: ");
            for (i=0; i<n; i++){
                System.out.println(v[i]);
            }
    }
    public static void ordem(int[] v) {
        int i, j, n=5;
        int aux;
        for (j=0; j<n-1;j++){
            for (i=0; i<n-j-1; i++){
                if (v[i]>v[i+1]){
                    aux = v[i];
                    v[i] = v[i+1];
                    v[i+1] = aux;
                }
            }
        }
    }

}
