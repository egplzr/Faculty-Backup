/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author enzo.gpelizaro
 */
public class Livro {

    String nome;
    int ISBN;

    public Livro(String nome, int ISBN) {
        this.nome = nome;
        this.ISBN = ISBN;
    }
    
    @Override
    public String toString() {
        return "Nome do livro: "+nome+ "\nCódigo ISBN: "+String.format("%d", ISBN);
    }
}
