package model;

import java.util.Date;

public class UsuarioModel {
    private int idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Date nascimento;

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
}



/*
idUsuario int auto_increment primary key,
    nome varchar(200) NOT NULL,
    cpf varchar(14) NOT NULL UNIQUE,
    email varchar(150) NOT NULL,
    telefone varchar(150) NOT NULL,
    idade int NOT NULL,
    nascimento date NOT NULL


*/