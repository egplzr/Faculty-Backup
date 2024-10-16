import java.util.Scanner;

public class Ado1 {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();
    }

    public static void ex1() {
        int n = 5, aux = 0, i;
        int[] v = new int[n];
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            v[i] = s.nextInt();
        }

        for (i = 0; i < 5; i++) {
            aux += v[i];
        }

        System.out.println(aux);
    }

    public static void ex2() {
        int n = 5, aux = 0, i;
        int[] v = new int[n];
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            v[i] = s.nextInt();
        }

        for (i = 0; i < 5; i++) {
            if (v[i] > aux) {
                aux = v[i];
            }
        }

        System.out.println(aux);
    }

    public static void ex3() {
        int n = 5, aux = 0, i;
        int[] v = new int[n];
        boolean resposta = false;
        Scanner s = new Scanner(System.in);

        System.out.println("preencher vetor:");
        for (i = 0; i < 5; i++) {
            v[i] = s.nextInt();
        }

        System.out.println("elemento para ser verificado:");
        aux = s.nextInt();

        for (i = 0; i < 5; i++) {
            if (v[i] == aux) {
                resposta = true;
            }
        }

        if (resposta == true) {
            System.out.printf("o elemento %d está presente no vetor.", aux);
        } else {
            System.out.printf("o elemento %d não está presente no vetor.", aux);
        }
    }

    public static void ex4() {
        int n = 5, aux = 0, i;
        int[] v = new int[n];
        double media;
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            v[i] = s.nextInt();
        }

        for (i = 0; i < 5; i++) {
            aux += v[i];
        }

        media = (double) aux / n;
        System.out.printf("%.2f", media);
    }

    public static void ex5() {
        int i, j, aux, n = 5;
        int[] v = new int[n];
        boolean verif = false;
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            v[i] = s.nextInt();
        }

        for (j = 0; j < n - 1; j++) {
            for (i = 0; i < n - j - 1; i++) {
                if (v[i] > v[i + 1]) {
                    verif = false;
                } else {
                    verif = true;
                }
            }
        }

        if (verif == true) {
            System.out.printf("o vetor está ordenado.");
        } else {
            System.out.printf("o vetor não está ordenado");
        }
    }
}