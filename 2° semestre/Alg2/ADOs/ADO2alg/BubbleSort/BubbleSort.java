
import java.util.ArrayList;
import java.util.Collections;

 
    public class ordemCrescente {
        public static void main(String[] args) {
    //Altere o tamanho na variavel tam;
    int tam = 100;   
    long contadorDeComparacao = 0;
    long contadorDeMovimento = 0;
    int vetor1[]= new int[tam];
    int aux;
    Boolean controle;
    // preenchendo o vetor
    for (int i = 0; i < vetor1.length; i++) {
	vetor1[i]=i;
	}
  //bubble sort ordem crescente
    // for que garante que o processo de comparação ocorra durante todo o tamanho do vetor
    for (int j = 0; j < vetor1.length; j++) {
        controle = true;
        //responsavel pelas comparaçoes
        for (int k = 0; k < vetor1.length - 1; k++) {
            contadorDeComparacao++; 
            if (vetor1[k] > vetor1[k + 1]) {
                aux = vetor1[k];
                vetor1[k] = vetor1[k + 1];
                vetor1[k + 1] = aux;
                contadorDeMovimento++;
                controle = false;
            }
        }
        if (controle) {
            break;
        }
    }
    System.out.println("Contador de Comparação: " + contadorDeComparacao);
    System.out.println("Contador de Movimento: " + contadorDeMovimento);
    }
}

public class ordemDecrecente {
    public static void main(String[] args) {
         //Altere o tamanho na variavel tam;
         int tam = 100;
         long contadorDeComparacao = 0;
	 long contadorDeMovimento = 0;
	 int vetor1[] = new int[tam];
	 int aux;
         Boolean controle;
	    // Preenchendo o vetor
	    for (int i = 0; i < vetor1.length; i++) {
	        vetor1[i] = i; 
	    }
	    // Bubble sort decrecente
	    //for garante que o processo de comparação ocorra durante todo o tamanho do vetor
	    for (int j = 0; j < vetor1.length; j++) {
	        controle = true;
	        //responsavel pelas comparaçoes
	        for (int k = 0; k < vetor1.length - 1; k++) {
	            contadorDeComparacao++; 
	            if (vetor1[k] < vetor1[k + 1]) {
	                aux = vetor1[k];
	                vetor1[k] = vetor1[k + 1];
	                vetor1[k + 1] = aux;
	                contadorDeMovimento++;
	                controle = false;
	            }
	        }
	        if (controle) {
	            break;
	        }      
	    }
	    System.out.println("Contador de Comparação: " + contadorDeComparacao);
	    System.out.println("Contador de Movimento: " + contadorDeMovimento);
	}
}


public class Aleatorio {
    public static void main(String[] args) {
    //Altere o tamanho na variavel tam;    
    int tam=100;
    Random aleatorio = new Random();
    long contadorDeComparacao = 0;
    long contadorDeMovimento = 0;
    int vetor1[]= new int[tam];
    int aux;
    Boolean controle;
    // preenchendo o vetor
    for (int i = 0; i < vetor1.length; i++) {
        vetor1[i]=aleatorio.nextInt(101);
	}
  //bubble sort ordem crescente
    // for que garante que o processo de comparação ocorra durante todo o tamanho do vetor
    for (int j = 0; j < vetor1.length; j++) {
        controle = true;
        //responsavel pelas comparaçoes
        for (int k = 0; k < vetor1.length - j - 1; k++) {
            contadorDeComparacao++; 
            if (vetor1[k] > vetor1[k + 1]) {
                aux = vetor1[k];
                vetor1[k] = vetor1[k + 1];
                vetor1[k + 1] = aux;
                contadorDeMovimento++;
                controle = false;
            }
        }
        if (controle) {
            break;
        }
    }
    System.out.println("Contador de Comparação: " + contadorDeComparacao);
    System.out.println("Contador de Movimento: " + contadorDeMovimento);
    }
}


