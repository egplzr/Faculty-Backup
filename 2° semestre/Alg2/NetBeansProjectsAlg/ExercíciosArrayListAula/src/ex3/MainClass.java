/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author enzo.gpelizaro
 */
public class MainClass {
    public static void main(String[] args) {
        Biblioteca teca = new Biblioteca();
        Livro kaikGay = new Livro("Kaik Gay Volume 1", 69);
        Livro inacioViado = new Livro("Inacio Viado Edição Limitada", 79);
        
        teca.adicionarLivro(kaikGay);
        teca.adicionarLivro(inacioViado);
        
        System.out.println(kaikGay.toString());
        
        teca.imprimirLivros();
    }
}
