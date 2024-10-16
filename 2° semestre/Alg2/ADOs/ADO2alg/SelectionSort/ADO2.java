package ado2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author EEEenxxeee
 */
public class ADO2 {

    public static void main(String[] args) {
        
        long tempoInicialMili, tempoInicialNano, tempoFinalMili, tempoFinalNano, duracaoMili, duracaoNano;
        
        tempoInicialMili = System.currentTimeMillis();
        tempoInicialNano = System.nanoTime();
        
        int[] v = new int[100];
        preencherVetorAleatorio(v);
        
        long countTrocas = 0;
        int i, j, aux;
        for (i = 0; i < v.length - 1; i++) {
            int menor = i;
            for (j = i + 1; j < v.length; j++) {
                if (v[menor] > v[j]) {
                    menor = j;
                    countTrocas++;
                }
            }
            aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;
        }
        
        
        tempoFinalMili = System.currentTimeMillis();
        tempoFinalNano = System.nanoTime();
        
        duracaoMili = tempoFinalMili - tempoInicialMili;
        duracaoNano = tempoFinalNano - tempoInicialNano;
        
        System.out.println("Trocas realizadas: "+countTrocas);
        System.out.printf("duração Milissegundos: %d\nduração Nanossegundos: %d", duracaoMili, duracaoNano);
    }
    
    public static int[] preencherVetorAleatorio(int[] v){
        Random rand = new Random();

        for (int i = 0; i < v.length; i++) {
            v[i] = rand.nextInt(0, 999999);
        }
        
        return v;
    }
    
    public static int[] preencherVetorCrescente(int[] v){
   
        for (int i = 0; i < v.length; i++) {
            v[i] = i;
        }
        
        return v;
    }
    
    public static int[] preencherVetorDecrescente(int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i] = v.length-i;
        }
        
        return v;
    }
}
