package com.estelamaria.emprestalivro.apiteca.service;

import com.estelamaria.emprestalivro.apiteca.model.Emprestimo;
import com.estelamaria.emprestalivro.apiteca.repository.EmpestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmprestimoService {

    //Importando EmprestimoRepository
    @Autowired
    private EmpestimoRepository emprestimoRepository;

    //Métodos
    private Boolean validaDataDevolucao(LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        if(dataDevolucao.isBefore(dataEmprestimo)) {
            return false;
        }
        return true;
    }

    public void salvaEmprestimo(Emprestimo emprestimo) {
        if(validaDataDevolucao(emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao())) {
            emprestimoRepository.save(emprestimo);
        } else throw new IllegalArgumentException("Data de devolução inválida");
    }
}
