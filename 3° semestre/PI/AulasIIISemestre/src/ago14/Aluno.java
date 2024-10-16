/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ago14;

import javax.swing.JOptionPane;

/**
 *
 * @author enzo.gpelizaro
 */
public class Aluno {
    String nome, ra;
    float nota1, nota2;

    //getters
    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "RA: %s\nNOME: %s\nNOTA 1: %.2f\nNOTA 2: %.2f\nMEDIA: %.2f".formatted(ra, nome, nota1, nota2, media(nota1, nota2)));
    }
    
    public float media(float nota1, float nota2){
        return (nota1 + nota2) / 2;
    }
    
    
}
