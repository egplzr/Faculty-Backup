/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudorecursividade;

import java.util.Arrays;

public class EstudoRecursividade {

    public static int ex1(int[] v, int tam) {
        if (tam == 0){
            return v[tam];
        }
        return v[tam] + ex1(v, tam-1);
    }
    
    public static String ex2(String normal){
        if (normal.isEmpty()){
            return normal;
        }
        return ex2(normal.substring(1)) + normal.charAt(0);
    }
    
    public static void main(String[] args) {
        //EXERCICIO 1:
//        int tam = 5;
//        int[] v = new int[tam];
//        
//        Arrays.fill(v, 1);
//        
//        System.out.println(ex1(v, tam -1));
        
        //EXERCICIO 2:
            /* Métodos:
               toCharArray() => transforma a string em um array de chars;
               charAt() => retorna o char especifico de uma string de acordo com o index; 
               substring() => retotna parte da String determinada pelo index*/
        
//        String normal = "paulo";
//        String invertida = ex2(normal);
//        
//        System.out.println(normal);
//        System.out.println(invertida);
        
        
    }
    
}
