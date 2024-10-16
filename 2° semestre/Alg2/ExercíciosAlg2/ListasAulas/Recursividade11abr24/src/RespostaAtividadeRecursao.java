
/**
 *
 * @author enzo.gpelizaro
 */
public class RespostaAtividadeRecursao {
    
    public static int somaIterativo(int[] v, int tamanho){
        int total = 0;
        for (int i = 0; i < tamanho; i++){
            total += v[i];
        }
        
        return total;
    }
    
    public static int produtoIterativo(int[] v, int tamanho){
        int total = ;
        for (int i = 0; i < tamanho; i++){
            total *= v[i];
        }
        
        return total;
    }
    
    public static int somaRecursivo(int[] v, int tamanho){
        if (tamanho == 0){
            return 0;
        } else {
            return v[tamanho-1] + somaRecursivo(v, tamanho-1);
        }
    }
    
    public static int produtoRecursivo(int[] v, int tamanho){
        if (tamanho == 0){
            return 1;
        } else {
            return v[tamanho-1] * produtoRecursivo(v, tamanho-1);
        }
    }
    
    public static int[] somaEProduto(int[] v, int tamanho){
        int[] resultado = new int [2];
        resultado[0] = somaRecursivo(v, tamanho);
        resultado[1] = produtoRecursivo(v, tamanho);
        return resultado;
    }
    
    public static void main(String[] args) {
       int[] v = {1,2,3,4,5};
       int tamanho = v.length;
       int[] resultado = somaEProduto(v, tamanho);
        System.out.println("Somatório: " + resultado[0]);
        System.out.println("Produtório: " + resultado[1]);
    }
}
