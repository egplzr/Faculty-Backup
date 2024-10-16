package estruturaestatica.stackQueue;

import estruturaestatica.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(){
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileirar(T elemento){
        super.adiciona(elemento);
    }

    public void desenfileirar(){
        super.remove(0);
    }

    public T espiar(){
        return super.elementos[0];
    }
}
