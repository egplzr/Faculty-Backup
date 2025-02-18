package estruturaestatica;

public class EstruturaEstatica<T>{
    public T[] elementos;
    public int tamanho;

    //constructors:
    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
    }

    public void adiciona(T elemento){
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public boolean adiciona(int posicao, T elemento){
        if(!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public void  aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho -1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

    public boolean vazia(){
        return this.tamanho == 0;
    }

    public void remove(int posicao){
        if(!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = 0; i < tamanho -1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }
}
