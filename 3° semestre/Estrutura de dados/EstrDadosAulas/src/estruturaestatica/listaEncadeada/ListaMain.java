package estruturaestatica.listaEncadeada;

public class ListaMain {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        System.out.println("Tamanho da Lista = " + lista.getTamanho() + "\n");

        lista.adiciona("Claudio");

        System.out.println(lista + "\n");
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Início da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

        System.out.println("\n=====================================================================\n");

        lista.adiciona("Camila");

        System.out.println(lista + "\n");
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Início da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

        lista.adiciona("Enzo");
        lista.adiciona("Rebeca");
        System.out.println(lista.getNo(2));
        System.out.println(lista.getNo(3));
        System.out.println(lista.getNo(0));
    }
}
