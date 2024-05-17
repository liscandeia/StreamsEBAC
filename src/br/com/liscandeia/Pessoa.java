package br.com.liscandeia;

import java.util.List;

public class Pessoa {
    String nome;
    String sexo;
    Integer idade;

    public Pessoa(String nome, String sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Integer getIdade() {
        return idade;
    }

}
