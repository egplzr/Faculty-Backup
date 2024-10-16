/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author enzo.gpelizaro
 */
public class Medico {

    private String crm;
    private String nome;
    private String cpf;
    private String especialide;
    private String dataNascimento;
    private String cidadeAtuacao;
    private String email;
    private String telefone;
    private String senha;

    public Medico(String crm, String nome, String cpf, String especialide, String dataNascimento, String cidadeAtuacao, String email, String telefone, String senha) {
        this.crm = crm;
        this.nome = nome;
        this.cpf = cpf;
        this.especialide = especialide;
        this.dataNascimento = dataNascimento;
        this.cidadeAtuacao = cidadeAtuacao;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Medico(String crm, String senha) {
        this.crm = crm;
        this.senha = senha;
    }

    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEspecialide() {
        return especialide;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCidadeAtuacao() {
        return cidadeAtuacao;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialide(String especialide) {
        this.especialide = especialide;
    }

    public void setCidadeAtuacao(String cidadeAtuacao) {
        this.cidadeAtuacao = cidadeAtuacao;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
