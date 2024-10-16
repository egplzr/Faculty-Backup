
import java.util.Random;

public class Insertion {

    public static void main(String[] args) {
        //tamanho do vetor desejado
        int tamanho = 100;
        int[] v = new int[tamanho];
        Random rand = new Random();
        long contadorDeComparacoes = 0;
        long contadorDeMovimentacoes = 0;
        
       
        for (int i = 0; i < v.length; i++) {
            v[i] = rand.nextInt(1, tamanho+1);
        }
        //ordenarDecrescente(v);
        //Arrays.sort(v);
        
        for (int i = 1; i < v.length; i++) {
            int aux = v[i];
            int j = i - 1;
            contadorDeComparacoes++;
            while ((j >= 0) && (v[j] > aux)) {
                contadorDeMovimentacoes++;
                contadorDeComparacoes++;
                v[j+1] = v[j];
                j--;
            }
            v[j + 1] = aux;
            contadorDeMovimentacoes++;
        }
        
        System.out.println("Quantidade de comparações: " + contadorDeComparacoes);
        System.out.println("Quantidade de movimentações: " + contadorDeMovimentacoes);
        

    }
    
    public static void ordenarDecrescente(int[] v ){
        int aux;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] < v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;

                }
            }
        }

    }
}
