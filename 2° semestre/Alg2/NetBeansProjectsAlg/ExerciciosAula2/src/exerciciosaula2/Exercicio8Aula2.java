package exerciciosaula2;

import java.util.Scanner;

/**
 *
 * @author enzo.gpelizaro
 *
 * Exercício 8 - sub-rotina com parametro vetorA[25] que subtitua todos os
 * valores negativos por zero
 */
public class Exercicio8Aula2 {

    static int i, n = 25;

    public static void main(String[] args) {
        int v[] = new int[n];
        Scanner e = new Scanner(System.in);
        for (i = 0; i < n; i++) {
            v[i] = e.nextInt();
        }
        subs(v);
        System.out.println("vetor substituido: ");
        for (i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
    }

    public static void subs(int[] v) {
        for (i = 0; i < n; i++) {
            if (v[i] < 0) {
                v[i] = 0;
            }
        }
    }
}
