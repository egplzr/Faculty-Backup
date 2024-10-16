
package metodoordenacaovetinsertion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author enzo.gpelizaro
 */
public class MetodoOrdenacaoVetInsertion {
    public static void main(String[] args) {
        int[] v = {8,12,3,4,6,2,75,3,21,879,548,7985,86441,5648};
        int tam = v.length;
        System.out.println(Arrays.toString(insertion(v, tam)));
        System.out.println("Método busca binária, digite um número para buscar");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(buscaBinaria(v, tam, num));
    }
    
    public static int[] insertion(int v[], int tam){
        for(int i = 1; i < tam; i++){
            int aux = v[i];
            int j = i - 1;
            while ((j >= 0) && (v[j] > aux)){
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = aux;
        }
        return v;
    }
    
    public static int buscaBinaria(int v[], int tam, int num){
        int ini, fim, meio;
        ini = 0;
        fim = tam;
        while (ini <= fim){
            meio = (int)(ini + fim)/2;
            if (v[meio] == num) return meio;
            if (v[meio] > num)fim = meio - 1;
            if (v[meio] < num) ini = meio + 1;
        }
        return -1;
    }
    
}
