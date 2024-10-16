package ListasAulas;

import java.util.Scanner;

public class ListaVet {
    public static void main (String[] args){
        //exerc1();
        exerc2();
    }

    public static void exerc1(){
        int[] v = new int[9];
        Scanner s = new Scanner(System.in);

        System.out.println("Preencha o vetor:");
        for (int i = 0; i < v.length; i++){
            v[i] = s.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 2; j <= Math.sqrt(v[i]); j++){
                if (v[i] % j == 0){
                    System.out.println(v[i]);
                } else {
                    System.out.printf("%d primo - posição: %d \n", v[i], i);
                }
            }
        }
    }

    public static void exerc2(){

    }
}

