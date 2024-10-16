
package exercíciosarraylistaula;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author enzo.gpelizaro
 */
public class ExercíciosArrayListAula {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        ex6prof();
    }
    
    public static void ex1(){
        ArrayList<String>nomes = new ArrayList <>();
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Maria");
        
        nomes.remove("João");
    }
    
    public static void ex2(){
        ArrayList<Integer>numeros = new ArrayList <>();
        
        for (int i = 1; i <= 5; i++){
            numeros.add(i);
        }
        
        boolean verif = numeros.contains(3);
        
        if (verif = true){
            System.out.println("O n° 3 está na lista.");
        } else {
           System.out.println("O n° 3 não está na lista.");
        }
    }
    
    public static void ex3(){
        ArrayList<Integer>idades = new ArrayList <>();
        Random r = new Random();
        
        for (int i = 1; i <= 5; i++){
            idades.add(r.nextInt(101));
        }
        
        
        for (int n:idades){
            System.out.println(n);
        }
    }
    
    public static void ex4() {
        ArrayList<String>palavras = new ArrayList <>();
        
        palavras.add("Enzo");
        palavras.add("Abacaxi");
        palavras.add("Zimbabwe");
        palavras.add("Algoritmos");
        palavras.add("Java");
        palavras.add("Casa");
        
        int tamanho = palavras.size();
        System.out.println("Tamanho da lista: "+tamanho);
    }
    
    public static void ex5() {
        ArrayList<Integer>elementos = new ArrayList <>();
        
        elementos.add(1);
        elementos.add(2);
        elementos.add(8);
        elementos.add(5);
        
        elementos.clear();
    }
    
    public static void ex6() {
        ArrayList<Integer>origem = new ArrayList <>();
        ArrayList<Integer>destino = new ArrayList <>();
        
        for (int i = 0; i < 6; i++){
            origem.add(i);
        }
        
        
        for (int i = 0; i < 6; i++){
            destino.add(origem.get(i));
        }
        
        for (int j:origem){
            System.out.println(j);
        }
        
        System.out.println("------------------------------");
       
        for (int k:destino){
            System.out.println(k);
        }
    }
    
    public static void ex6prof(){
        ArrayList<Integer>origem = new ArrayList <>();
        
        for (int i = 0; i < 6; i++){
            origem.add(i);
        }
        
        ArrayList<Integer>destino = new ArrayList <>(origem);
}
}
