/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

import java.util.ArrayList;

/**
 *
 * @author enzo.gpelizaro
 */
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    
    public void adicionarLivro(Livro ObjLivro){
        livros.add(ObjLivro);
    }
    
    public void imprimirLivros(){
        System.out.println(livros.toString());
    }
}

