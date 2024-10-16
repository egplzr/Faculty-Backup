package estruturaestatica.listaEncadeada;

public class ListaEncadeada <Tipo>{
    private No inicio;
    private No fim;
    private int tamanho;

    //Construtores
    public ListaEncadeada() {
        this.tamanho = 0;
    }

    //Metodos criados
    public void adiciona(Tipo elemento){
        No<Tipo> celula = new No<Tipo>(elemento);

        if(this.inicio == null && this.fim == null){
            this.inicio = celula;
            this.fim = celula;
        } else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }

    public void remove(Tipo elemento){
        No anterior = null;
        No atual = this.inicio;

        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getElemento().equals(elemento)){
                if(this.tamanho == 1){
                    this.inicio = null;
                    this.fim = null;
                } else if (atual == inicio) {
                    this.inicio = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == fim) {
                    this.fim = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                    this.tamanho--;
                    break;
                }
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public No getNo(int posicao){
        No atual = this.inicio;

        for (int i = 0; i < posicao; i++) {
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }

        return atual;
    }

    //Getters & setters
    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //toString
    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio = " + inicio +
                '}';
    }
}
