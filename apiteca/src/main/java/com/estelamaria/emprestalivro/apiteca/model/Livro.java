package com.estelamaria.emprestalivro.apiteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro {

    //Atributos
    @Id
    @GeneratedValue
    private Long codigoLivro;

    private String nomeLivro;
    private String autorLivro;

    //Métodos
    @Override
    public String toString() {
        return "Livro{" +
                "codigoLivro=" + codigoLivro +
                ", nomeLivro='" + nomeLivro + '\'' +
                ", autorLivro='" + autorLivro + '\'' +
                '}';
    }

    //Getters and Setters
    public Long getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(Long codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }
}
