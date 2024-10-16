import java.util.Random;

public class Senha {
    //Enzo Guedes Pelizaro
    private int n;
    private  int tipo;
    private int posicaoFila;

    public static int COMUM  = 0;
    public static int PREFERENCIAL = 1;

    public Senha() {
    }

    public Senha(int n, int tipo, int posicaoFila){
        this.n = n;
        this.tipo = tipo;
    }

    public static void gerarSenha(Fila senhas, int qntdeSenhas) {
        Random rand = new Random();

        for (int i = 0; i < qntdeSenhas; i++) {
            int n = rand.nextInt(0, 49);

            do {
                if (senhas.contem(n)) {
                    n = rand.nextInt(0, 49);
                } else {
                    break;
                }
            } while (true);

            Senha senha = new Senha(n, rand.nextInt(0, 2), i);
            senhas.enfileirar(senha);

        }
    }

    public int getPosicaoFila() {
        return posicaoFila;
    }


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString(){
        if(this.tipo == 1){
            return "%d".formatted(this.n);
        }else{
            return "%d".formatted(this.n);
        }

    }
}
