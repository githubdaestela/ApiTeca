package com.estelamaria.emprestalivro.apiteca.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Emprestimo {

    //Atributos
    @Id
    @GeneratedValue
    private Long codigoEmprestimo;

    @ManyToOne
    @JoinColumn(name = "codigoUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "codigoLivro")
    private Livro livro;

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    //Métodos

    @Override
    public String toString() {
        return "Emprestimo{" +
                "codigoEmprestimo=" + codigoEmprestimo +
                ", usuario=" + usuario +
                ", livro=" + livro +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }

    //Getters and Setters
    public Long getCodigoEmprestimo() {
        return codigoEmprestimo;
    }

    public void setCodigoEmprestimo(Long codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
