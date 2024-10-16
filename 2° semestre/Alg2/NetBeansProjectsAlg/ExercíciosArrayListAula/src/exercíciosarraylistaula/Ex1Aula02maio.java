package exercíciosarraylistaula;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1Aula02maio {

    public static void main(String[] args) {
        
    }
    
    public static void ex2(){
        ArrayList<Integer> idades = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (true) {
            int idade = s.nextInt();
            if (idade == -1){
                break;
            } else {
                idades.add(idade);
            }
        }
        System.out.println(idades.toString());
    }
    
    
}
