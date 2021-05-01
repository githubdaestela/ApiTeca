package com.estelamaria.emprestalivro.apiteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {

    //Atributos
    @Id
    @GeneratedValue
    private long codigoUsuario;

    private String nomeCompleto;
    private String dataNascimento;
    private String endereco;

    //Métodos
    @Override
    public String toString() {
        return "Usuario{" +
                "codigoUsuario=" + codigoUsuario +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    //Getters and Setters
    public long getCodigoUsuario() {

        return codigoUsuario;
    }

    public void setCodigoUsuario(long codigoUsuario) {

        this.codigoUsuario = codigoUsuario;
    }

    public String getNomeCompleto() {

        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {

        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {

        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {

        return endereco;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }
}
