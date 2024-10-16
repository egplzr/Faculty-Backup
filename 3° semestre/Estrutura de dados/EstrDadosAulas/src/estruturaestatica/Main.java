package estruturaestatica;

import estruturaestatica.stackQueue.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha<Integer> p = new Pilha<>();

        for (int i = 0; i <= 12; i++) {
            p.empilha(i);
        }

        System.out.println(p);
        System.out.println(p.tamanho());
        System.out.println(p.topo());
        System.out.println(p.desempilha());
        System.out.println(p);
    }
}
