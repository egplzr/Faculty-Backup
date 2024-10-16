import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class Matriz {
    //ALUNO: Enzo Guedes Pelizaro, TURMA A, 3°Semestre;
    private int[][] matriz;
    private int qLinhas;
    private int qColunas;
    private int countL, countC;
    private int elementos;
    private int somaElementos = 0;
    private int somaDiagonalPrincipal;
    private int somaDiagonalSecundaria;

    private int maiorNumero = 0, menorNumero = 999999999;


    public Matriz(int linhas, int colunas){
        this.qLinhas = linhas;
        this.qColunas = colunas;
        this.matriz = new int[this.qLinhas][this.qColunas];
        this.countL = 0;
        this.countC = 0;
    }

    public void add(int elementos) throws Exception{
        this.elementos = elementos;
        if (this.countL < this.qLinhas){
            while(this.countL != this.qLinhas) {
                if (this.countC < this.qColunas) {
                    this.matriz[this.countL][this.countC] = elementos;
                    countC++;
                    somaElementos += elementos;
                    if (maiorNumero < elementos) maiorNumero = elementos;
                    if (menorNumero > elementos) menorNumero = elementos;
                    break;
                } else if (this.countC == this.qColunas && this.countL < this.qLinhas) {
                    countL++;
                    this.countC = 0;
                } else {
                    throw new Exception("A matriz já está cheia, imposssível adicionar mais elementos");
                }
            }
        }
    }

    public String printMatriz(){
        return Arrays.deepToString(this.matriz);
    }

    public int somaElementosMatriz() {
        return somaElementos;
    }

    public int maiorNumero(){
        return maiorNumero;
    }
    public int menorNumero(){
        return menorNumero;
    }
    public int sDiagonalPrincipal(){
        int ind = 0;

        for ( int i = 0 ; i < this.qLinhas ; i++ ) {
            for ( int j = 0 ; j < this.qColunas ; j++ ) {
                if ( i == j ){
                    this.somaDiagonalPrincipal += this.matriz[i][j];
                    ind++;
                }
            }
        }
        return this.somaDiagonalPrincipal;
    }

    public int sDiagonalSecundaria(){
        int ind = 0;
        int tam = this.qLinhas;

        for ( int coluna = tam-1 ; coluna > -1 ; coluna-- ) {
            this.somaDiagonalSecundaria += this.matriz[ ind ][ coluna ];
            ind++;
        }

        return this.somaDiagonalSecundaria;
    }


}
