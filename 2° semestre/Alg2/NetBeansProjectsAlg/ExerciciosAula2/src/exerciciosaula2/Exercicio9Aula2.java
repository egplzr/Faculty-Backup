package exerciciosaula2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio9Aula2 {

    public static void main(String[] args) {
        int[] v = new int[5];
        Scanner e =new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            v[i] = e.nextInt();
        }
        deter(v);
    }

    public static void deter(int[] v) {
        int numMenor = 99999;
        int numMaior = -9999;
        for (int i = 0; i < 5; i++) {
            if (numMaior < v[i]) {
                numMaior = v[i];
            }
            if (numMenor > v[i]) {
                numMenor = v[i];

            }
        }
        System.out.printf("Numero menor: %d\nNumero maior: %d", numMenor, numMaior);
    }
}
