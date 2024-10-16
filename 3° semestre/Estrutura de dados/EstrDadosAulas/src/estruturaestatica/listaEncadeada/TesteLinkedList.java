package estruturaestatica.listaEncadeada;

import java.util.LinkedList;

public class TesteLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Enzo");
        lista.add("Rebeca");
        lista.add("Marcos");
        lista.add("Bebel");

        System.out.println(lista + "\n");

        System.out.println("Tamanho da lista = " + lista.size());
        System.out.println("Inicio da lista = " + lista.getFirst());
        System.out.println("Fim da lista = " + lista.getLast());
        System.out.println("Buscar 2° posição na lista = " + lista.get(2));
        System.out.println("Buscar o nome Rebeca na lista = " + lista.contains("Rebeca"));
        lista.remove(2);
        lista.remove("Bebel");
        System.out.println(lista);
        System.out.println("Tamanho da lista = " + lista.size());
    }
}
