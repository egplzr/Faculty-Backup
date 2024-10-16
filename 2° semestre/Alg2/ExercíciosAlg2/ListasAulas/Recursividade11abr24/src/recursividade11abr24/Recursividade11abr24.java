package recursividade11abr24;
/**
 * @author enzo.gpelizaro
 */
public class Recursividade11abr24 {
    
    public static int pinosIterativo(int linhas){
        int total = 0;
        for(int i = 0; i < linhas; i++){
            total += 1;
        }
        return total;
    }
    
    public static int pinosRecursivo(int linhas){
        if (linhas == 1){
            return 1;
        } else {
            return linhas + pinosRecursivo(linhas - 1);
        }
    }
    
    public static int fatorialIterativo(int num){
        int total = 0;
        for (int i = 0; i < num; i++){
            total += i * num;
        }
        return total;
    }
    
    public static int fatorialRecursivo(int num){
        if (num == 0){
            return 1;
        } else {
            return num * fatorialRecursivo(num-1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(fatorialIterativo(4));
        System.out.println(fatorialRecursivo(4));
    }
    
}
