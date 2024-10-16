package estruturaestatica.stackQueue;

import estruturaestatica.EstruturaEstatica;

public class Pilha <T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T desempilha(){
        if (vazia()){
            return null;
        } else {
            T elementoRemovido = this.elementos[tamanho-1];
            tamanho--;
            return elementoRemovido;
        }
    }

    public T topo() {
        if (vazia()){
            return null;
        }else{
            return super.elementos[tamanho-1];
        }
    }
}
