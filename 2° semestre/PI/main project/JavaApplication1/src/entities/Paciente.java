/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author enzo.gpelizaro
 */
public class Paciente {
    private String id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String cidade;
    private String email;
    private String telefone;
    private String senha;

    public Paciente(String id, String nome, String cpf, String dataNascimento, String endereco, String cidade, String email, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }
    
    public Paciente(String nome, String cpf, String dataNascimento, String endereco, String cidade, String email, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Paciente(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
    
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
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

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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
